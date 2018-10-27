package Kapitel_53;

public class Buecher extends Waren implements Besteuerbar 
{

	String autor;
	
	public Buecher( String beschreibung, double preis, String autor ) 
	{
		super(beschreibung, preis);
		this.autor = autor;
	}
	
	@Override
	void anzeigen() 
	{
		super.anzeigen();
		System.out.println( "Autor: " + autor );
	}
	
	@Override
	public double berechneSteuer() 
	{
		return preis * STEUERSATZ;
	}

}
