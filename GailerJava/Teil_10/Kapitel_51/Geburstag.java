package Kapitel_51;

public class Geburstag extends Karte 
{

	int alter;
	
	public Geburstag( String e, int jahre ) 
	{
		empfaenger = e;
		this.alter = jahre;
	}
	
	@Override
	public void gruss() 
	{
		System.out.println("Dear" + empfaenger + ".\n");
		System.out.println("alles gute zum " + alter + ". Geburtstag.\n\n");

	}

}
