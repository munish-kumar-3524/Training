package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {

	final static InputStreamReader ISR = new InputStreamReader(System.in);
	final static BufferedReader BR = new BufferedReader(ISR);
	
	public static void main(String args[]) throws IOException {
		
		LinkedList<Character> inputList = new LinkedList<>();
		int i = 0;
		
		System.out.print("Enter the elements of list : ");
		while((i = BR.read()) != '\n') {
			if(i != ' ') {
				inputList.add((char)i);
			}
		}
		
		int first = 0;
		int last = inputList.length()-1;
		inputList.display();
		System.out.println();
		while(last >= first) {
			char tempChar1 = inputList.get(last);
			char tempChar2 = inputList.get(first);
			inputList.set(first, tempChar1);
			inputList.set(last, tempChar2);
			last--;
			first++;
		}
		inputList.display();
		
	}
}
