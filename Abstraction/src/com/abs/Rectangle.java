package com.abs;

public class Rectangle extends Shapes {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.drawShape();
		r.colorShape();
		r.moveShape();
		r.reshape();
	}

	@Override
	public void drawShape() 
	{
		System.out.println("Drawing Rectangle");
	}

	@Override
	public void colorShape() 
	{
		System.out.println("Color Rectangle");
	}

	@Override
	public void moveShape() 
	{
		System.out.println("Move Rectangle");
	}

}
