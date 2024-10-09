package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
//#
//# #
//# - #
//# - - #
//# # # # #
public class Pattern21 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter matrix:");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=1;Columns<=Rows;Columns++)
			{
				if(Rows==1 || Rows==n || Columns==1 || Columns==Rows)
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
