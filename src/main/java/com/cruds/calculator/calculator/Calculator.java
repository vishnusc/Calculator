package com.cruds.calculator.calculator;

public class Calculator {
	
	private int a;
	private int b;
	
	public Calculator() {
		
	}

	public Calculator(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	

	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void add(Calculator c){
		int sum = c.getA() + c.getB();
		System.out.println("Sum of two num =" + sum);
	}
	
	public void sub(Calculator c){
		int subtraction = c.getA() + c.getB();
		System.out.println("subtraction of two num" + subtraction);
	}
	

}
