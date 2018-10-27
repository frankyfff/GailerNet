package Kapitel_28;

import java.awt.Point;

public class Temp {

	public static void main(String[] args) 
	{
		Point pointA = new Point();
		
		short		a = 93,		b = 92;
		int			i = 12,		j = 13;
		long		x = 0,		y = 44;
		double		u = 0,		v = 99.2;
		
		pointA.move(i, j);
		pointA.move(a, b);
		pointA.move(a, j);
		
	//	pointA.move(x, y);
		
		pointA.move( (int)x, (int)y );
		
	//	pointA.move( i, v );
		
		pointA.move( i, (int)v );
	}
	
}
