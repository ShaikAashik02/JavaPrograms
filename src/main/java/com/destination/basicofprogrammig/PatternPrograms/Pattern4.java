package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3 3
// 4 4 4 4 4
// 5 5 5 5 5
public class Pattern4 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=n;Rows++) 
		{
			for(int Column=1;Column<=n;Column++)
			{
				System.out.print(Rows+" ");
			}
			System.out.println();
		}
	}

}
