package com.abs;

public abstract class Shapes {

	//abstract mehods
	public abstract void drawShape();

	public abstract void colorShape();
	
	public abstract void moveShape();
	
	
	//concrete method
	public void reshape()
	{
		System.out.println("Print re-shape");
	}
	
}
