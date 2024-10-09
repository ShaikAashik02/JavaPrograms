package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// 1
// 2	7
// 3	8	13
// 4	9	14	19
// 5	10	15	20	25

public class Pattern13 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=n;Rows++)
		{
			int Count=Rows;
			for(int Columns=1;Columns<=Rows;Columns++)
			{
				System.out.print(Count+"	");
				Count+=n;
			}
			System.out.println();
		}
	}

}
