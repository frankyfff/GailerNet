package Kapitel_31;

public class Auto {

	double startMeilen;
	double endMeilen;
	double gallonen;
	
	public Auto( double startMeilen, double endTacho, double galls) {
		
		this.startMeilen = startMeilen;
		this.endMeilen = endTacho;
		this.gallonen = galls;
	}
	
	double berechneMPG()
	{
		
		return (endMeilen - startMeilen) / gallonen ;
	}
	
}
