package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// A B C D E
// F G H I J
// K L M N O 
// P Q R S T
// U V W X Y
public class Pattern25 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		char Alphabet = 'A';
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=1;Columns<=n;Columns++)
			{
				System.out.print(Alphabet+" ");
				Alphabet++;
			}
			System.out.println();
		}
		
	}

}
