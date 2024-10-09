package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class Pattern11 
{
	public static void main(String[] args) 
	{   Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=1;Columns<=Rows;Columns++)
			{
				System.out.print(Columns+" ");
			}
			System.out.println();
		}
		
	}

}
