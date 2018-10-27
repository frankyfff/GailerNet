package Kapitel_53;

public class Spielwaren extends Waren implements Besteuerbar 
{
	int mindestalter;
	
	public Spielwaren( String beschreibung, double preis, int mindestalter ) 
	{
		super( beschreibung, preis);
		this.mindestalter = mindestalter;
	}
	
	@Override
	void anzeigen() 
	{
		super.anzeigen();
		System.out.println( "Mindestlater: " + mindestalter );
	}
	
	@Override
	public double berechneSteuer() 
	{
		return preis * STEUERSATZ;
	}

}
