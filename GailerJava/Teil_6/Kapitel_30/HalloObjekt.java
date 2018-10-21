package Kapitel_30;

public class HalloObjekt {
	
	String mitteilung;
	
	public HalloObjekt( String str ) {
		mitteilung = str;
	}
	
	void sprich()
	{
		System.out.println( mitteilung );
	}
	
}
