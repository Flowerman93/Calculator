package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalkulatorApplication.class, args);

		Calculator calculator = new Calculator();
		calculator.addition(5, 3);
		calculator.subtraction(3.5 ,4);
	}
}
