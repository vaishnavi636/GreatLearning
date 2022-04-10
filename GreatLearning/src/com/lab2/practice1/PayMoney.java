package com.lab2.practice1;

import java.util.Scanner;

public class PayMoney {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
//creating array with user inputed size
		int[] arr = new int[size];
		System.out.println("Enter the Values of array");

		for (int transaction = 0; transaction < size; transaction++) {

			arr[transaction] = sc.nextInt(); // 12 20 15 18

			
		}
		System.out.println("Number of Targets that needs to be achieved");
		int nos = sc.nextInt();
		for(int i=1;i<=nos;i++)
		{
			
		System.out.println("Enter the no of target: ");
		int target = sc.nextInt();// 32
		int transaction=0;
		int sum = 0;

		for (transaction = 0; transaction < size; transaction++) {
			sum = sum + arr[transaction];
			if (sum >= target) {
				break;
				// System.out.println(arr[transaction]);

			}}
			if (sum < target) {
				System.out.println("Target not Acheived");
			} else
				{System.out.println("Target achieved after " + (transaction+1) + " Transactions");
				}
		
	}
}
}
