package com.test;

import org.apache.log4j.Logger;

public class Log4jTestRun {
	final static Logger logger = Logger.getLogger(Log4jTestRun.class);
	
	 public static void main(String[] args) {


	        try
	        {

	            log_time_as_seconds_change();

	        }
	        catch (Exception e)
	        {
	            System.out.println("Logger timer is interrupted unexpectedly.");
	        }


	    }

	    public static void log_time_as_seconds_change() throws Exception
	    {
	        boolean infinite_loop = true;
	        long timer = 0;
	        while(infinite_loop) {
	            if((timer%60)==0){
	                logger.warn("SHOWS MINUTES IN WARNING LOG");
	            }if((timer%3600)==0){
	                logger.error("SHOWS HOURS IN ERROR LOG");
	            }
	            logger.info("SHOWS SECONDS IN Info log");

	            sleep_one_second();
	            timer++;

	            }
	        }



	    public static void sleep_one_second() throws Exception
	    {
	        long milliseconds = System.currentTimeMillis();

	        Thread.sleep(1000);
	    }

	}

