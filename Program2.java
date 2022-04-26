package com;

import java.util.Scanner;

class Program2 {
	public static void main(String[] args)
	{

		Scanner Scan = new Scanner(System.in);
		int a=Scan.nextInt();
		
		for(int i=1;i<=a+a;i++){
			if(i%2!=0){
			System.out.print(i);
			if(i<(a+a)-1)
			{
				System.out.print(", ");
			}
			}

			}
		}
	}
