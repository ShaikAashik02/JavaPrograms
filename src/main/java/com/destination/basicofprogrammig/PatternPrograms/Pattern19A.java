package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;

//# # # # # 
//# # # # 
//# # # 
//# # 
//# 
//# #
//# # #
//# # # #
//# # # # #
public class Pattern19A 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=(n*2)-1;Rows++)
		{
			int Column_Limit=(Rows<=n)?n-Rows+1:n+Rows-((n*2)-1);
			for(int Columns=1;Columns<=Column_Limit;Columns++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
