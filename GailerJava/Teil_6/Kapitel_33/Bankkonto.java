package Kapitel_33;

public class Bankkonto {
	
	//Daten-Deklration
	private String kontonummer;
	private String kontoinhaber;
	private int kontostand;
	private int zaehler = 0;
	
	//Konstructor
	public Bankkonto( String ktoNummer, String ktoInhaber, int start ) 
	{
		kontonummer 	= ktoNummer;
		kontoinhaber 	= ktoInhaber;
		kontostand 		= start;
	}
	
	//Methoden
	int aktuellerKontostand()
	{
		return kontostand;
	}
	
	void verarbeiteEinzahlung( int betrag )
	{
		inkrementZaehler();
		kontostand = kontostand + betrag;
	}
	
	void verarbeiteAuszahlung( int betrag )
	{
		inkrementZaehler();
		int gebuehr;
		if ( kontostand < 100000 ) 
			gebuehr = 15;
		else
			gebuehr = 0;
		kontostand = kontostand - betrag - gebuehr;
	}
	
	private void inkrementZaehler()
	{
		zaehler = zaehler + 1;
	}
	
	void anzeigen()
	{
		System.out.println( kontonummer + "\t" + kontoinhaber + "\t" + kontostand + "\t" + zaehler);
	}

}
