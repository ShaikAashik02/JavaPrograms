package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
//  1
//  2  3
//  4  5  6
//  7  8  9  10
// 11  12 13 14 15
public class Pattern12 
{
	public static void main(String[] args) 
	{   
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		int Count=1;
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=1;Columns<=Rows;Columns++)
			{
				System.out.print(Count+"	");
				Count++;
			}
			System.out.println();
		}
		
	}

}
