package com.home;

import java.util.Scanner;

public class Binary
{
	public static void toBinary(int decimal)
	{
	     int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	System.out.println();  

		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int decimal = Integer.parseInt(args[0]);
		toBinary(decimal);
		
	}
	
	

}
