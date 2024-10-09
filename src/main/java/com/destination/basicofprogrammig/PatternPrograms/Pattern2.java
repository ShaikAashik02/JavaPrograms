package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// # # # # #
public class Pattern2 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int n = Sc.nextInt();
		for(int Column=1;Column<=n;Column++)
		{
			System.out.print("# ");
		}
		
	}

}
