package Kapitel_28;

import java.awt.Point;

public class AutoConvertBsp {

	public static void main(String[] args) {
		
		Point pointB = new Point();
		
		short a=12, b=42;
		
		pointB.move(a, b);
		
		System.out.println("Neue Position:"+pointB);
		
	}

}
