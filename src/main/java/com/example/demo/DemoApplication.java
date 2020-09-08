package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String text = sc.nextLine();
		StringToInt strToInt = new StringToInt(text);
		int result = strToInt.ConvertToInt();
		System.out.println(result);
		sc.close();

		SpringApplication.run(DemoApplication.class, args);
	}

}
