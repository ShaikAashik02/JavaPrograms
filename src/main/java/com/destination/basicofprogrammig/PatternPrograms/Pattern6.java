package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// 1	2	3	4	5
// 6	7	8	9	10
// 11	12	13	14	15
// 16	17	18	19	20
// 21	22	23	24	25
public class Pattern6 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		int Count=1;
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=1;Columns<=n;Columns++)
			{
				
				System.out.print(Count+"	");
				Count++;
			}
			System.out.println();
		}
	}
}
