package Opps;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("cand do the factoial ");
		int num=kb.nextInt();
		if (num <0)
		{
			System.out.println("cand do the factoial ");
		}
		
		else
		{
			int fact=1;
			for(int i=1; i <num; i++)
			{
				fact= fact*i;
				
			}
			System.out.println("no output " + fact);
		}
		
		kb.close();
		
		// TODO Auto-generated method stub

	}

}
