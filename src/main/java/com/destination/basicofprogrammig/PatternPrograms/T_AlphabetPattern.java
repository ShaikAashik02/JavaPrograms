package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;

public class T_AlphabetPattern 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the n Value: ");
		int n = Sc.nextInt();
		for(int Rows=0;Rows<=n-1;Rows++)
		{
			for(int Columns=0;Columns<=n-1;Columns++)
			{
				if(Rows==0 || Columns==(n/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
