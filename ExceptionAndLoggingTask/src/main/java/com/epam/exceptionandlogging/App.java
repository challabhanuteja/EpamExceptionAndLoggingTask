package com.epam.exceptionandlogging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	public static void main(String[] args) {
		LOGGER.info("starting the simple interest calculation");
		InterestCalculator i = new InterestCalculator();
		LOGGER.debug("simple interest is "+i.getSimpleInterest(100,2,4));
		LOGGER.info("starting the compound interest calculation");
		LOGGER.debug("simple interest is "+i.getCompoundInterest(100,2,4,1));
		LOGGER.info("starting Construction cost calculation");
		Construction c = new Construction();
		LOGGER.debug("construction cost is "+c.getCost("standard materials", 5000));
		
	}

}
