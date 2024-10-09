package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// a b c d e
// f g h i
// j k l
// m n
// o
public class Pattern27A 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		char Alphabet = 'a';
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=1;Columns<=n-Rows+1;Columns++)
			{
				System.out.print(Alphabet+" ");
				Alphabet++;
			}
			
			System.out.println();
		}
	}

}
