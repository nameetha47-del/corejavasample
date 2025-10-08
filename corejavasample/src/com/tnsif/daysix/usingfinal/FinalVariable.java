package com.tnsif.daysix.usingfinal;

public class FinalVariable {
	final int x = 100; // initialized
	final static int Y; // static blank final
	final static int Z = 10; // initialized once

	static {
		Y = 20; // allowed (initialized only once)
		System.out.println("Value of Y: " + Y);
	}

	void change() {
		// x = 30; // ❌ Not allowed
		// Y = 200; // ❌ Not allowed
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y=" + Y + "]";
	}
}
