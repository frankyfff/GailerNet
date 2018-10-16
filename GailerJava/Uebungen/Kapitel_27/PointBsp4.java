package Kapitel_27;

import java.awt.Point;

public class PointBsp4 {

	public static void main(String[] args) {
		
		Point a = new Point();
		Point b = new Point(12,45);
		Point c = new Point(b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
