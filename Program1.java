package com;

import java.util.Scanner;

class Program1 {
	public static void main(String[] args)
	{
		double a ,b ;

		Scanner scan = new Scanner(System.in);

		a= scan.nextDouble();

		b=scan.nextDouble();


		String x = scan.next();

		switch(x)
		{
		case "+": System.out.println(a + b);
		break;

		case "-": System.out.println(a - b);
		break;

		case "*": System.out.println(a * b);
		break;

		case "/": System.out.println(a / b);
		break;

		default : System.out.println("In valid input Please enter a value then b value enter type of operation");
		}

	}
}

