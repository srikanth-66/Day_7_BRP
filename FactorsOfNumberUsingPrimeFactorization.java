package com.home;

import java.util.Scanner;

public class FactorsOfNumberUsingPrimeFactorization
{
	public static void primeFactors(int number)
	{
	      for(int i = 2; i< number; i++) 
	      {
	          while(number%i == 0) 
	          {
	             System.out.println(i+" ");
	             number = number/i;
	          }
	       }
//	       if(number >2) {
//	          System.out.println(number);
//	       }
	    }
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for finding the prime factors");
		int number=sc.nextInt();
		System.out.println("the prime factors for the given number are :");
		primeFactors(number);
	}


}
