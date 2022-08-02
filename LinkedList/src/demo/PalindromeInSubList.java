package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeInSubList {

	final static InputStreamReader ISR = new InputStreamReader(System.in);
	final static BufferedReader BR = new BufferedReader(ISR);
	
	public static void main(String[] args) throws IOException {
		LinkedList<Character> inputList1 = new LinkedList<>();
		LinkedList<Character> inputList2 = new LinkedList<>();
		int i = 0;
		
		System.out.print("Enter the elements of small list : ");
		while((i = BR.read()) != '\n') {
			if(i != ' ') {
				inputList1.add((char)i);
			}
		}
		
		System.out.print("Enter the elements of large list : ");
		while((i = BR.read()) != '\n') {
			if(i != ' ') {
				inputList2.add((char)i);
			}
		}
		
		boolean result = devideTheGivenList(inputList1, inputList2);
		
		if(result) {
			System.out.println("has a Palindrome");
		}else {
			System.out.println("has no palindrome");
		}
	}

	private static boolean devideTheGivenList(LinkedList<Character> inputList1, LinkedList<Character> inputList2) {
		
		for(int i = 0; i < inputList2.length()-inputList1.length(); i++) {
			LinkedList<Character> inputList3 = new LinkedList<>();
			for(int j = 0; j < inputList1.length(); j++) {
				inputList3.add(inputList2.get(i+j));
			}
			if(checkPalindrome(inputList1, inputList3)) {
				return true;
			}
		}
		return false;
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
