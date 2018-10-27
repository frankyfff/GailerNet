package Kapitel_50;

import javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder;

public class Musikvideo extends Videoband {

	String kuenstler;
	String kategorie;
	
	public Musikvideo(String ttl, int laenge ,String kuenst, String kateg)
	{
		super(ttl, laenge);
		this.kuenstler = kuenst;
		this.kategorie = kateg;
	}
	
	public void anzeigen()
	{
		super.anzeigen();
		System.out.println( "Künstler: "+kuenstler+" Kategorie: "+kategorie);
	}
}
