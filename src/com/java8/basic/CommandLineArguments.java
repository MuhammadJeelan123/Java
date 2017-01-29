package com.java8.basic;

import java.util.Random;

public class CommandLineArguments {
	public static void main(String[] args){
	
		Random random= new Random();
		for(int i=0;i<11;i++)
			System.out.println("Iteration "+i +" Random numbers "+random.nextInt(10));
	}

}
