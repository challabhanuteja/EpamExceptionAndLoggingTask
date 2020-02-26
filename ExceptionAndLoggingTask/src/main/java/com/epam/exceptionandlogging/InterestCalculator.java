package com.epam.exceptionandlogging;

public class InterestCalculator {
	
	double getSimpleInterest(double principle, double timeInYears, double rateOfInterest)
	{
		
		double simpleInterest;
		simpleInterest = (principle * timeInYears * rateOfInterest )/100;
		return simpleInterest;
	}
	
	double getCompoundInterest(double principle, double timeInYears, double annualRateOfInterest, double noOfTimesInterestCompounded) {
		
		double compoundInterest;
		compoundInterest = (principle * Math.pow(1 + (annualRateOfInterest / 100), noOfTimesInterestCompounded));
		return compoundInterest;
	}
}
