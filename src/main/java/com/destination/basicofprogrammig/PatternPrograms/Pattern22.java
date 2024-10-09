package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// - - - - - #
// - - - - # # #
// - - - # # # # #
// - - # # # # # # #
// - # # # # # # # # #
public class Pattern22 
{
	public static void main(String[] args) 
	{
		//int Count=0;
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=n;Columns>=Rows;Columns--)
			{
				System.out.print("- ");
			}
			for(int Columns=1;Columns<=2*Rows-1;Columns++)
			{
				System.out.print("# ");
				
			}
			//Count++;
			
			System.out.println();
		}
		
	}

}
