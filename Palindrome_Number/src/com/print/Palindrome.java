package com.print;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		
		for(int i=0;i<=num;i++)
		{
			int temp = i;
			int rem = 0;
			int rev = 0;

			while(temp>0)
				{
					rem = temp % 10;
					rev = rev * 10 + rem;
					temp = temp / 10;
				}
			if(i == rev)
			{
				System.out.println(i);
			}
//			else
//			{
//				System.out.println(i);
//			}
		}
	}
}
