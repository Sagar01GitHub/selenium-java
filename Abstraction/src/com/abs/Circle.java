package com.abs;

public class Circle extends Shapes{

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.drawShape();
		c.colorShape();
		c.moveShape();
		c.reshape();
		
	}

	@Override
	public void drawShape() 
	{
		System.out.println("Drawing circle");
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
