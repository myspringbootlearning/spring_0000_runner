package com.ymd.learn.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	public void run(ApplicationArguments args) throws Exception {
		String[] strArgs = args.getSourceArgs();
		System.out.println("------MyApplicationRunner start-----");
		for(int i=0; i<strArgs.length; i++) {
			System.out.println(strArgs[i]);
		}
		System.out.println("------MyApplicationRunner end-----");
	}

}
