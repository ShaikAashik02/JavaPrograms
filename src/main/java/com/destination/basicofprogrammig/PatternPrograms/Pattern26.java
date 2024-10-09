package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// A
// B C
// D E F
// G H I J
// K L M N O
public class Pattern26 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		char Alphabet='A';
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=1;Columns<=Rows;Columns++)
			{
				System.out.print(Alphabet+" ");
				Alphabet++;
			}
			
			System.out.println();
		}
	}

}
