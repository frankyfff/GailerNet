package Kapitel_31;

import java.util.Scanner;

public class MeilenProGallone {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double startMeilen, endMeilen, gallonen;
		
		System.out.println("Anfangstand eingeben: ");
		startMeilen = scan.nextDouble();
		
		System.out.println("Endstand eingeben: ");
		endMeilen = scan.nextDouble();
		
		System.out.println("Gallonen eingeben: ");
		gallonen = scan.nextDouble();
		
		Auto auto = new Auto( startMeilen, endMeilen, gallonen );
		System.out.println( "Meilen pro Gallone; "+ auto.berechneMPG());
	}

}
