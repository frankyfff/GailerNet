package Kapitel_27;

import java.awt.Point;

public class PointBsp3 {

	public static void main(String[] args) {

		Point a = new Point();				//Deklaration und Konstruktion kombiniert
		Point b = new Point(12, 45);
		Point c = new Point(b);
		
		System.out.println(a.toString());	//einen temporären String
											//basierend auf "a" erzeugen
		
	}

}
