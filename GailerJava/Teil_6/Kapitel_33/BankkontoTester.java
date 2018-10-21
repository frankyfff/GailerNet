package Kapitel_33;

public class BankkontoTester {

	public static void main(String[] args) {
		
		Bankkonto bobsKonto = new Bankkonto( "999" , "Bob" , 100 );
		
		bobsKonto.verarbeiteAuszahlung( 50 );
		//bobsKonto.inkrementZaehler();
		//bobsKonto.zaehler = 15;
	}

}
