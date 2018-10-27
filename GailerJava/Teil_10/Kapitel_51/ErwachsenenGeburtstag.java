package Kapitel_51;

public class ErwachsenenGeburtstag extends Geburstag 
{

	public ErwachsenenGeburtstag(String e, int jahre) {
		super(e, jahre);
	}
	
	@Override
	public void gruss() 
	{
		super.gruss();
		System.out.println( "Du siehst so jung aus wie immer!" );
	}

}
