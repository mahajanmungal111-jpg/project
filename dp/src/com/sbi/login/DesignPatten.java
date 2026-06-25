package com.sbi.login;

public class DesignPatten {
	//static	private DesignPatten dp =null;//lazy
	static	private DesignPatten dp =new DesignPatten();//eagar 
	private DesignPatten() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static DesignPatten  getData()
	{
		if(dp==null)
			dp=new DesignPatten();
		return dp;
	}

}
