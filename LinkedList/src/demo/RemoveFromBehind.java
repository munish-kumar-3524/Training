package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RemoveFromBehind {

	final static InputStreamReader ISR = new InputStreamReader(System.in);
	final static BufferedReader BR = new BufferedReader(ISR);
	final static Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		LinkedList<Character> inputList = new LinkedList<>();
		int i = 0;
		
		System.out.print("Enter the elements of list : ");
		while((i = BR.read()) != '\n') {
			if(i != ' ') {
				inputList.add((char)i);
			}
		}
		
		System.out.print("Enter the position from behind : ");
		int positionFromBehind = SC.nextInt();
		
		int actualPosition = inputList.length() - positionFromBehind;
		
		inputList.remove(actualPosition);
		inputList.display();
	}

}
