package Kapitel_53;

public class Kaufhaus 
{

	public static void main(String[] args) 
	{
		Waren 			waren 			= new Waren( "Tube", 1.40 );
		Lebensmittel	lebensmittel	= new Lebensmittel( "Milch" , 0.95 , 690 );
		Spielwaren		spiel			= new Spielwaren( "Lego" , 24.45 , 8 );
		Buecher			buch			= new Buecher( "Emma" , 14.95 , "Austin" );
		
//		waren.anzeigen();
//		lebensmittel.anzeigen();
//		spiel.anzeigen();
//		
//		System.out.println( "Die Steuer betraegt: " + spiel.berechneSteuer() + "\n" );
		
//		buch.anzeigen();
//		System.out.println( "Die Steuer betraegt: " + buch.berechneSteuer() + "\n" );
		
		Besteuerbar artikel1 = new Buecher( "Emma" , 24.95, "Austin" );
//		Besteuerbar artikel2 = new Spielwaren( "Lego" , 54.45 , 8 );
//		
//		System.out.println( "Steuer fuer Artikel 1: " + artikel1.berechneSteuer() );
//		System.out.println( "Steuer fuer Artikel 2: " + artikel2.berechneSteuer() );
		
		((Buecher)artikel1).anzeigen();
	}

}
