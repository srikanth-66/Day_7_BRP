package com.home;

import java.util.Scanner;

public class SecondLargestAndSmallestOfUnsortedArray
{
	public int secondLargestNumber(int []arr,int n)
	{
		for (int i = 0; i < n; i++)   
        {  
            for (int j = i + 1; j < n; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                   int temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
       return arr[n-2];  

		
	}
	public int secondSmallestNumber(int []arr,int n)
	{
		for (int i = 0; i < n; i++)   
        {  
            for (int j = i + 1; j < n; j++)   
            {  
                if (arr[i] < arr[j])   
                {  
                   int temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
       return arr[n-2];  
	}
	public static void main(String[] args) 
	{
		SecondLargestAndSmallestOfUnsortedArray sls=new
				SecondLargestAndSmallestOfUnsortedArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int [] array=new int [size];
		int n=array.length;
		System.out.println("enter the array elements");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("the array elements are:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);	
		}
		
		System.out.println(" The Second largest number in a given array is:"
				+sls.secondLargestNumber(array,n));
		System.out.println(" The Second smallest number in a given array is:"
				+sls.secondSmallestNumber(array,n));
	}

}
