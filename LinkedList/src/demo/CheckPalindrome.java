package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome {

	final static InputStreamReader ISR = new InputStreamReader(System.in);
	final static BufferedReader BR = new BufferedReader(ISR);
	
	public static void main(String args[]) throws IOException {
		LinkedList<Character> inputList1 = new LinkedList<>();
		LinkedList<Character> inputList2 = new LinkedList<>();
		int i = 0;
		
		System.out.print("Enter the elements of first list : ");
		while((i = BR.read()) != '\n') {
			if(i != ' ') {
				inputList1.add((char)i);
			}
		}
		
		System.out.print("Enter the elements of second list : ");
		while((i = BR.read()) != '\n') {
			if(i != ' ') {
				inputList2.add((char)i);
			}
		}
		
		boolean result = checkPalindrome(inputList1, inputList2);
		
		if(result) {
			System.out.println("Is a Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

	private static boolean checkPalindrome(LinkedList<Character> inputList1, LinkedList<Character> inputList2) {
		boolean result = true;
		if(inputList1.length() != inputList2.length()) {
			return false;
		}else {
			int characters[] = new int[128];
			for(int i = 0; i < inputList1.length(); i++) {
				characters[inputList1.get(i)]++;
			}
			
			for(int i = 0; i < inputList2.length(); i++) {
				characters[inputList2.get(i)]--;
			}
			
			for(int i = 0; i < characters.length; i++) {
				if(characters[i] != 0) {
					return false;
				}
			}
		}
		return result;
	}
}
