package Kapitel_51;

public class Valentin extends Karte 
{

	int kuesse;
	
	public Valentin( String e, int k) 
	{
		empfaenger = e;
		this.kuesse = k;
	}
	
	@Override
	public void gruss() 
	{
		System.out.println("Dear " + empfaenger + ",\n");
		System.out.println("herzlichen Gruesse und Kuesse,\n");
		for (int j=0; j<kuesse; j++)
		{
			System.out.print( "X" );
			System.out.println( "\n\n" );
		}

	}

}
