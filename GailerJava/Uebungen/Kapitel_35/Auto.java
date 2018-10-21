package Kapitel_35;

public class Auto {
	
	private int startMeilen;
	private int endMeilen;
	private double gallonen;
	
	public Auto( int startMeilen, int endTacho, double galls) {
		
		this.startMeilen = startMeilen;
		this.endMeilen = endTacho;
		this.gallonen = galls;
	}
	
	double berechneMPG()
	{
		
		return (endMeilen - startMeilen) / gallonen ;
	}
	
	void auftanken( int aktuellerTacho, double getankteGalls )
	{
		startMeilen = endMeilen;
		endMeilen = aktuellerTacho;
		gallonen = getankteGalls;
	}

}
