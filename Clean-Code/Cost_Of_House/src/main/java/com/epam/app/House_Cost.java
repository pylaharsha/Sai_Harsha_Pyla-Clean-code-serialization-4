package com.epam.app;

public class House_Cost {
	static float find_cost_house(int choice,float area)
	{
		if (choice==4)
		{
			return 2500*area;
		}
		else
		{
			return 300*(choice+3)*area;
		}
	
	}
}
