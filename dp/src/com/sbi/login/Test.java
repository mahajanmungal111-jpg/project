package com.sbi.login;

public class Test {



	public static void main(String[] args) {

		DesignPatten dp1=DesignPatten.getData();
		DesignPatten dp2=DesignPatten.getData();
		System.out.println(dp1.hashCode());
		System.out.println(dp2.hashCode());
	}

}
