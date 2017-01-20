/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute Pythagorean Theorem:");
		//reading in values from user
		int a = readInt("a: ");
		int b = readInt("b: ");
		//does calculation and prints out result
		double c = Math.sqrt(a*a + b*b);
		println("c = " + c);
	}
}
