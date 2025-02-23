package com.smt.kata.word;

/****************************************************************************
 * <b>Title</b>: SpinningWords.java 
 * <b>Project</b>: SMT-Kata 
 * <b>Description: </b> Spinning Words
 * 
 * Write a function that takes in a string of one or more words, and returns the
 * same string, but with all five or more letter words reversed (like the name
 * of this kata).  Words will be capitalized after, the spin, so this
 * will have the effect of the last letter being upper cased for all of the 
 * spun words.  Words that are not spun will retain their original case
 * 
 * Strings passed in will consist of only letters and spaces. Spaces will be
 * included only when more than one word is present. Examples:
 * 
 * spinWords("Hey fellow warriors") => "Hey wolleF sroirraW" 
 * spinWords("This is a test") => "This is a test" 
 * spinWords("This is another test") => "This is rehtonA test"
 * 
 * <b>Copyright:</b> Copyright (c) 2021 
 * <b>Company:</b> Silicon Mountain  Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 30, 2021
 * @updates:
 ****************************************************************************/
public class SpinningWords {
	
	/**
	 * Spins each word that is at least 5 characters.  Upper cases the last character 
	 * in each word
	 * @param input Element to be spun
	 * @return String that has been spun.  Empty string otherwise
	 */
	public String spin(String input) {
		return input;
    }

}
