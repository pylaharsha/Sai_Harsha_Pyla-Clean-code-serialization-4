package com.epam.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App extends House_Cost {
    Scanner s=new Scanner(System.in);
    @SuppressWarnings("resource")
	static void App()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the area of site in square feet");
		float area=scan.nextFloat();
		System.out.println("Enter the choice of fully automated home\n1.YES\n2.NO");
		int choice=scan.nextInt();
		if (choice==1)
		{
			System.out.println("cost of house construction : "+find_cost_house(4,area));
		}
		else if(choice==2)
		{
			System.out.println("select the type of house\n1.Standard material\n2.Above Standard material\n3.High Standard material");
			int choice1=scan.nextInt();
			if (choice1<1 && choice1>3)
			{
				System.out.println("Enter valid choice:");
			}
			else
			{
				System.out.println("cost for house construction : "+find_cost_house(choice1,area));
			}
		}
		else
		{
			System.out.println("Enter valid choice");
		}
	}
    public static void main( String[] args )
    {
    	App obj1=new App();
  		obj1.App();
    }
}
