package Kapitel_51;

public class Feiertag extends Karte {

	public Feiertag( String e ) 
	{
		empfaenger = e;
	}
	
	@Override
	public void gruss() 
	{
		System.out.println( "Dear " + empfaenger + ",\n" );
		System.out.println( "frohe Feiertage!\n\n" );
	}

}
