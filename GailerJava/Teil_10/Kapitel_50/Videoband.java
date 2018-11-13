package Kapitel_50;

public class Videoband 
{
	String	titel;
	int		laenge;
	boolean	vorhanden;
	
	//Konstruktor
	public Videoband( String ttl ) 
	{
		titel		=	ttl;
		laenge		=	90;
		vorhanden	=	true;
	}
	
	//Konstruktor
	public Videoband( String ttl, int len ) 
	{
		titel		=	ttl;
		laenge 		=	len;
		vorhanden	=	true;
	}
	
	private void anzeigen() 
	{
		System.out.println( titel + ", " + laenge + " Min. verfuegbar: " + vorhanden );

	}
}
