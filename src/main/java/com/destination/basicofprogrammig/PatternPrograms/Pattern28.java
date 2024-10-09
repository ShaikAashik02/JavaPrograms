package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// 1 1 1 1 1
// 0 0 0 0 0
// 1 1 1 1 1
// 0 0 0 0 0
// 1 1 1 1 1
public class Pattern28 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix: ");
		int n = Sc.nextInt();
		for(int Rows=1;Rows<=n;Rows++)
		{
			for(int Columns=1;Columns<=n;Columns++)
			{
				System.out.print(Rows%2+" ");
			}
			/* Another Method
			for(int Columns=1;Columns<=n;Columns++)  
			{
				if(Rows%2==1)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}              
                          
          */
			System.out.println();
		}
		
	}
}