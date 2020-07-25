package com.epam.app;

public class Intrest_calculator {
	float simple_interest(float princpal_amount,int no_of_years,float rate_of_interest)
	{
		return (princpal_amount*no_of_years*rate_of_interest)/100;
	}
	float compound_interest(float principal_amount,int times_cal,int years,float rate_of_interest)
	{
		return principal_amount*power((1+(rate_of_interest/times_cal)),times_cal*years)	;
	}
	float power(float n,int f)
	{
		float x=1;
		for(int i=0;i<f;i++)
		{
			x=x*n;
		}
		return x;
	}
}
