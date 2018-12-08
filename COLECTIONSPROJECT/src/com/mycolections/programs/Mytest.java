package com.mycolections.programs;

public class Mytest {
	public void   m1() throws ArithmeticException {
		int i=10/0;
		throw new ArithmeticException();
	}
	public void m2() {
		System.out.println("helloo");
	}
public static void main(String[] args) {
	Mytest m=new Mytest();
	m.m1();
	m.m2();
}
}
