package com.in;

public class Circle implements Shapes {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.drawShape();
		c.colorShape();
		c.moveShape();		
		
	}

	@Override
	public void drawShape() 
	{
	   System.out.println("Draw circle");
	}

	@Override
	public void colorShape()
	{
		System.out.println("Color circle");
	}

	@Override
	public void moveShape() 
	{
		System.out.println("Move circle");
	}

}
