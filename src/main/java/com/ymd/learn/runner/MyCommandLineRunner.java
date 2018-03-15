package com.ymd.learn.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(8)
public class MyCommandLineRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("------MyCommandLineRunner start-----");
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("------MyCommandLineRunner end-----");
	}

}
