package Kapitel_51;

import java.util.Scanner;

public class KarteTester 
{

	public static void main(String[] args) 
	{
		
//		Karte[] karten = new Karte[12];
//		
//		karten[0] = new KinderGeburtstag( "Valerie", 7);
//		karten[1] = new ErwachsenenGeburtstag( "Walter" , 47 );
//		karten[2] = new Geburstag( "Zoe" , 30);
//		
//		for ( int j=0; j <= 2; j++ ) 
//			karten[j].gruss();
		
		Object obj;
		KinderGeburtstag kinder = new KinderGeburtstag( "Ian" , 4 );
		
		obj = kinder;
		
		if (obj instanceof KinderGeburtstag)
			( ( KinderGeburtstag )obj ).gruss();
		
		if ( obj instanceof String)
			System.out.println( ( String )obj );
		
			
	}

}
