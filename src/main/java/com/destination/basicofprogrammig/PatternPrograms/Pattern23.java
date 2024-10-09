package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// A A A A A
// B B B B B
// C C C C C
// D D D D D 
// E E E E E
public class Pattern23 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter matrix : ");
		int n = Sc.nextInt();
		 char Alphabet = 'A';
		for(int Rows=1;Rows<=n;Rows++ )
		{
			for(int Columns=1;Columns<=n;Columns++)
			{
				System.out.print(Alphabet+" ");
			}
			Alphabet++;
			System.out.println();
		}
	}

}
