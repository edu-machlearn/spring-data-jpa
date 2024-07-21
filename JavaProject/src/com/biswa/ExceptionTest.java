package com.biswa;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("I am in first Line");
		int a=10;
		try {
			int res=10/0;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("Exception "+e.getMessage());
			a=20;
		}
		System.out.println("In Last"+a);
	}

}
