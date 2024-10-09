package com.destination.basicofprogrammig.PatternPrograms;

import java.util.Scanner;
// #
// #
// #
// #
// #
public class Pattern1 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Matrix:");
		int N = Sc.nextInt();
		for(int Rows=1;Rows<=N;Rows++ )
		{
			System.out.println("#");
		}
	}

}
