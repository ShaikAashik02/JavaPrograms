package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// # # # # #
// # - - - #
// # - - - #
// # - - - #
// # # # # #
public class Pattern20 
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
				if(Rows==1 || Rows == n || Columns==1 || Columns==n)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
