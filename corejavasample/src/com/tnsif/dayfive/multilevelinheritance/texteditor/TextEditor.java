package com.tnsif.dayfive.multilevelinheritance.texteditor;

public class TextEditor {
	public static void main(String[] args) {
		Word Word = new Word();

        Word.write("Hello, ");
        Word.formatText(true);
        Word.write("World!");
        Word.displayContent();

        Word.spellCheck();

        System.out.println("Is text in Wordpad bold? " + Word.isBold());
        System.out.println("Disabling spell check in Word.");
        Word.enableSpellCheck(false);
        Word.spellCheck();

	}

}
