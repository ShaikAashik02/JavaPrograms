package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
//25	24	23	22	21
//20	19	18	17	16
//15	14	13	12	11
//10	9	 8	7	 6 
// 5	4	 3	2	 1
public class Pattern7 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		int Count=n*n;
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=1;Columns<=n;Columns++)
			{
				System.out.print(Count+"	");
				Count--;
			}
			System.out.println();
		}
	}
}
