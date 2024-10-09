package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;


class Array
{
	int Arr1[];
	void BasicArray()
	{
		int Arr[] = new int[5];
		Arr[0] = 10;
		Arr[1] = 20;
		Arr[2] = 30;
		Arr[3] = 40;
		Arr[4] = 50;
		System.out.println(Arr[1]);
		System.out.println("The Length is "+Arr.length);
		System.out.println("========================");
	}
	
	void OneDArray()
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array");
		int Size = Sc.nextInt();
		Arr1 = new int[Size];
		for(int i = 0;i<=Arr1.length-1;i++)
		{
			System.out.println("The Value of Arr["+i+"] is "+ i );
		}
	}

}
public class PracticeOnArray 
{
	public static void main(String[] args) 
	{
		
		PracticeOnArray a = new PracticeOnArray();
		a.BasicArray();
		a.OneDArray();
	}

}
