package com.tnsif.daysixteen;

import java.util.ArrayList;

public class ArrayListThreadExample {

    public static void main(String[] args) {
        // Create an ArrayList shared by multiple threads
        ArrayList<Integer> numbers = new ArrayList<>();

        // Create and start two threads
        Thread producerThread = new Thread(new NumberProducer(numbers));
        Thread consumerThread = new Thread(new NumberConsumer(numbers));

        producerThread.start();
        consumerThread.start();
    }

    // Thread that produces numbers and adds them to the ArrayList
    static class NumberProducer implements Runnable {
        private final ArrayList<Integer> numbers;

        public NumberProducer(ArrayList<Integer> numbers) {
            this.numbers = numbers;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (numbers) { // ensure thread safety
                    numbers.add(i);
                    System.out.println("Produced: " + i);
                    numbers.notify(); // notify waiting consumer
                }
            }
        }
    }

    // Thread that consumes numbers from the ArrayList
    static class NumberConsumer implements Runnable {
        private final ArrayList<Integer> numbers;

        public NumberConsumer(ArrayList<Integer> numbers) {
            this.numbers = numbers;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (numbers) {
                    while (numbers.isEmpty()) {
                        try {
                            numbers.wait(); // wait until producer adds data
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int number = numbers.remove(0);
                    System.out.println("Consumed: " + number);

                    // Stop condition to exit gracefully
                    if (number == 5) {
                        break;
                    }
                }
            }
        }
    }
}
