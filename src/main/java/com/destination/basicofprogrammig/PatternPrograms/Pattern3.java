package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// # # # # #
// # # # # #
// # # # # #
// # # # # #
// # # # # #

public class Pattern3 
{ 
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=n;Rows++) 
		{
			for(int Columns=1;Columns<=n;Columns++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
