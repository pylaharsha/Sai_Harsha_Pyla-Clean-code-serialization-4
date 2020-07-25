package com.epam.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App extends Intrest_calculator
{
	Scanner scan=new Scanner(System.in);
	void App()
	{
		System.out.println("Enter the type of interest you want\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int type=scan.nextInt();
		if(type==1)
		{
			simple_Interest();
		}
		else if(type==2)
		{
			compound_Interest();
		}
		else
			System.out.println("Please select a valid option...!");
	}
	void simple_Interest()
	{
		System.out.println("Enter the principal amount");
		float principal_amount=scan.nextFloat();
		System.out.println("Enter number of years");
		int years=scan.nextInt();
		System.out.println("Enter rate of Interest");
		float rate_of_interest=scan.nextFloat();
		System.out.println("Simple interest is "+simple_interest(principal_amount,years,rate_of_interest));
	}
	void compound_Interest()
	{
		System.out.println("Enter the principal amount");
		float principal_amount=scan.nextFloat();
		System.out.println("Enter number of times to be calculated");
		int times_calc=scan.nextInt();
		System.out.println("Enter number of years");
		int years=scan.nextInt();
		System.out.println("Enter rate of interest");
		float rate_of_interest=scan.nextFloat();
		System.out.println("Compound interest is "+compound_interest(principal_amount,times_calc,years,rate_of_interest));
	}

    public static void main( String[] args )
    {
    	App object_1=new App();
		object_1.App();
    }
}
