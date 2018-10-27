package Kapitel_50;

public class Spielfilm extends Videoband {

	String regisseur;
	String bewertung;
	
	public Spielfilm( String ttl, int len, String reg, String bew ) 
	{
		super( ttl, len);
		this.regisseur = reg;
		this.bewertung = bew;
	}
	
	public void anzeigen()
	{
		super.anzeigen();
		System.out.println( "Regisseur: " + regisseur + " " + bewertung);
	}
	
	
}
