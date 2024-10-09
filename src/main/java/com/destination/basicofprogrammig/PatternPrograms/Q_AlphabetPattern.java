package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;

public class Q_AlphabetPattern 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the n Value: ");
		int n = Sc.nextInt();
		for(int i =0;i<=n-1;i++)
		{
			for(int j =0;j<=n-1;j++)
			{
				if(i==0 && j<=(3*n/4) || i==(3*n/4)&& j<=(3*n/4) || j==0 && i<=(3*n/4) || j==(3*n/4) && i<=(3*n/4) || i==j && i>=(n/2))
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
