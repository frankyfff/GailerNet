package Kapitel_51;

public class KinderGeburtstag extends Geburstag {

	public KinderGeburtstag(String e, int jahre) 
	{
		super(e, jahre);
	}
	

	public void gruss(String absender) 
	{
		super.gruss();
		System.out.println( "Was bist du gross geworden!!\n" );
		System.out.println( "In Liebe, " + absender + "\n" );
	}

}
