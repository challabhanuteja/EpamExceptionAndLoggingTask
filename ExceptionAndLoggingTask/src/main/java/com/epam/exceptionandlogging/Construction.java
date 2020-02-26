package com.epam.exceptionandlogging;

import java.lang.System.Logger;


public class Construction {

	double getCost(String materialStandard, double totalAreaOfHouse)
	{
		switch(materialStandard)
		{
		case "standard materials":
			return(1200 * totalAreaOfHouse);
		case "above standard materials":
			return(1500 * totalAreaOfHouse);
		case "high standard material":
			return(1800 * totalAreaOfHouse);
		case "high standard material and fully automated home":
			return(2500 * totalAreaOfHouse);
		default:
			return(-1);
		}
	}
}
