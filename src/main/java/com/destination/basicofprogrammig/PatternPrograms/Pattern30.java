package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// - - - - - 1
// - - - - 1 0 1
// - - - 1 0 0 0 1
// - - 1 0 0 0 0 0 1
// - 1 1 1 1 1 1 1 1 1
public class Pattern30 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=n;Rows++)
		{
//			for(int Columns=n;Columns>=Rows;Columns--)
//			{
//				System.out.print("- ");
//			}
			for(int Columns=1;Columns>=Rows;Columns--)
			{
				System.out.print("- ");
			}
			System.out.println();
		}
		
	}

}
