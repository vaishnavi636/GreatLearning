package com.lab2.practice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations:");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value:");

		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		reverse(array);
		// System.out.println(Arrays.toString(array));

		System.out.println("Enter the amount you want to pay:");
		int amount = sc.nextInt();
try {
		for(int i=0; i<size; i++) {
			if(array[i]<=amount) {
				int ans = amount/array[i];
				System.out.println(array[i] + ":" + ans);
				amount=amount%array[i];
				if(amount == 0) {
					break;
				}
					
			}//if close
		}
		

		if(amount !=0) {
            throw new ArithmeticException("exact amount cannot be given with higest denomination");    

		}
}catch(ArithmeticException e){
	e.printStackTrace();
}
	}

	public static void reverse(int[] array) {

		// Length of the array
		int n = array.length;

		for (int i = 0; i < n / 2; i++) {

			// Storing the first half elements temporarily
			int temp = array[i];

			// Assigning the first half to the last half
			array[i] = array[n - i - 1];

			// Assigning the last half to the first half
			array[n - i - 1] = temp;
		}
	}

}
