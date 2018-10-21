package Kapitel_34B;

public class OPTester {

	public static void main(String[] args) {
		
		String mitteilung = "Nur ein objekt" ;
		
		ObjektPrinter op = new ObjektPrinter();
		
		System.out.println( "Erster Wert von mitteilung: "+ mitteilung );
		op.ausgeben( mitteilung );
		System.out.println( "Zweiter Wert von mitteilung: "+ mitteilung );
		
	}

}
