package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggingAspect {
	private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);


//	public static final Logger Log = LoggerFactory.getLogger(LoggingAspect.class);
	
	
	@Before("execution(public * com.example.demo.UserController.getUser())")
	public void log() {
		System.out.println("getUser Method Called from aspect");
		log.info("getUser Method Called from aspect");
	}

}
