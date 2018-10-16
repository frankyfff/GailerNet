package Kapitel_27;

import java.awt.Point;

public class PointBsp2 {

	public static void main(String[] args) {
		
		Point a, b, c;

		a = new Point();
		b = new Point(12, 45);
		c = new Point(b);
		
		String strA = a.toString();
		System.out.println(strA);
		
		String strB = b.toString();
		System.out.println(strB);
		
		String strC = c.toString();
		System.out.println(strC);
	}

}
