package Kapitel_32;

public class Bankkonto 
{
	
	//Instanzvariablen
	String kontonummer;
	String kontoinhaber;
	int kontostand;
	
	//Konstruktor
	public Bankkonto( String ktoNummer, String ktoInhaber, int start) 
	{
		this.kontonummer = ktoNummer;
		this.kontoinhaber = ktoInhaber;
		this.kontostand = start;
	}
	
	//Methoden
	int aktuellerKontostand()
	{
		return kontostand;
	}
	
	//Methode zum Einzahlung 
	void verarbeiteEinzahlung ( int betrag )
	{
		kontostand = kontostand + betrag;
	}
	
	//Methode zum Auszahlung
	void verarbeiteAuszahlung ( int betrag )
	{
		int gebuehr;
		if ( kontostand < 100000 ) 
			gebuehr = 15;
		else
			gebuehr = 0;
			kontostand = kontostand - betrag - gebuehr;
	}
	
	//Methode zu anzeigen von Info
	void anzeigen()
	{
		System.out.println( kontonummer + "\t" + kontoinhaber + "\t" + kontostand );
	}

}
