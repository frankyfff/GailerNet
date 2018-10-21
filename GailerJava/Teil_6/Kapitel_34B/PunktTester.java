package Kapitel_34B;

public class PunktTester {

	public static void main(String[] args) {
		
//		MeinPunkt pt = new MeinPunkt();
//		PunktDoppler pd = new PunktDoppler();
//		
//		pt.ausgeben();
//		pd.zweimal( pt );
//		pt.ausgeben();
		
		UnveraenderbarerPunkt pt = new UnveraenderbarerPunkt( 4, 8 );
		pt.ausgeben();
		
		PunktPrinter pprinter = new PunktPrinter();
		pprinter.print( pt );

	}

}
