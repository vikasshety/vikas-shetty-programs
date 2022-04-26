package com;

import java.util.Scanner;

class program3 {
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int i=1;
		int b=a-1;
		if(a%2!=0){

			for(;i<=a+a;i++){
				if(i%2!=0){
					System.out.print(i);
					if(i<=(a+a)-2)
					{
						System.out.print(", ");
					}
				}
			}
		}
		else{
			for(;i<=b+b;i++){
				if(i%2!=0){
					System.out.print(i);
					if(i<=(b+b)-2)
					{
						System.out.print(", ");
					}
				}
			}
		}
	}
}
