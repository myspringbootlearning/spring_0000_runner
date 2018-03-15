package com.ymd.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerApplication {
	
	public static void main(String[] args) {
		System.out.println("------RunnerApplication start-----");
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("------RunnerApplication end-----");
		SpringApplication.run(RunnerApplication.class, args);
	}
	
}
