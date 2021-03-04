package com.capg.myapp.example;

public class User /*extends Calculator(This method is not proper coz calculator and user has no proper relation(is-a rel) but it is possible so avoid)*/ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calsi=new Calculator(); //this is preferd since its a has-a rel
		System.out.println(calsi.add(10, 20));
	}

}
