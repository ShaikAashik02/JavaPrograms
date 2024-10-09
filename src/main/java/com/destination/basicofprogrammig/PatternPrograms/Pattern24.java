package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// A
// A B
// A B C
// A B C D
// A B C D E
public class Pattern24 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=n;Rows++)
		{
			char Alphabet='A';
			for(int Columns=1;Columns<=Rows;Columns++)
			{
				System.out.print(Alphabet+" ");
				Alphabet++;
			}
			System.out.println();
		}
	}
}
