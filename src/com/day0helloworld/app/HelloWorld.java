package com.day0helloworld.app;

import java.util.Scanner;
/*
 * To complete this challenge, you must save a line of input from stdin to a variable, print Hello, World.
 * on a single line, and finally print the value of your variable on a second line.
 */

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your message: ");
		String message = scan.nextLine();
		scan.close();
		System.out.println("Hello, World.");
		System.out.println(message);
	}
}
