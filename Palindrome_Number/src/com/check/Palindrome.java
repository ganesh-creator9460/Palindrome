package com.check;

import java.util.Scanner;

public class Palindrome {

	public boolean isPalindrome(int x)
	{
		int temp=x;
		int rev=0;
		int rem=0;
		
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==x)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int x = sc.nextInt();
		
		Palindrome p = new Palindrome();
		
		System.out.println(x+" is palindrome number : "+p.isPalindrome(x));
		
	}
}
