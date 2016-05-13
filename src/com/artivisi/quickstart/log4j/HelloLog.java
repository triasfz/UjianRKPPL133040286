package com.artivisi.quickstart.log4j;

import java.util.logging.Logger;

public class HelloLog {

	public static void main(String[] args) {
		Logger Logger = Logger.getLogger(HelloLog.class);
		
		Logger.info("Ini adalah debug message : Contoh Log4J");
		Logger.warning("Ini adalah debug message : Contoh Log4J");
	}
		
		
		
}
