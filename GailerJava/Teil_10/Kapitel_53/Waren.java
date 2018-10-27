package Kapitel_53;

public class Waren 
{
	String beschreibung;
	double preis;
	
	public Waren( String beschreibung, double preis ) 
	{
		this.beschreibung = beschreibung;
		this.preis = preis;
	}
	
	void anzeigen()
	{
		System.out.println( "Artikel: " + beschreibung + " Preis: "+ preis);
	}
}
