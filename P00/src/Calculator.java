/**
 * 
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 * 22030366, 25 May 2023 9:49:54 am
 */

public class Calculator { //add comment

	public int add (int a, int b) {
		return a + b;
	}
	
	public int subtract (int a, int b) {
		return a - b;
	}
	
	public int multiple (int a, int b) {
		return a * b;
	}
	
	public int divide (int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}
}
