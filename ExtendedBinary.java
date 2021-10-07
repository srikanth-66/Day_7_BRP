package com.home;

import java.util.Scanner;

public class ExtendedBinary extends Binary
{
	public static int nibblesSwap(int decimal)
	{
	    return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4);

	}

//	public static void toBinary(int decimal)
//	{
//	     int binary[] = new int[40];    
//	     int index = 0;    
//	     while(decimal > 0){    
//	       binary[index++] = decimal%2;    
//	       decimal = decimal/2;    
//	     }    
//	     for(int i = index-1;i >= 0;i--){    
//	       System.out.print(binary[i]);    
//	     }    
//	System.out.println(); 
//		
//	}

	public static void main(String[] args)
	{
		Binary bn=new ExtendedBinary();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number that you want to convert into the 'Binary'");
		int decimalnumber=sc.nextInt();
		toBinary(decimalnumber);
		System.out.println("After the nibble Swap the number is:");
		System.out.println(nibblesSwap(decimalnumber));

	
		
	}

}
