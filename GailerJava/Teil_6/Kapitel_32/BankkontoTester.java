package Kapitel_32;

public class BankkontoTester 
{

	public static void main(String[] args) 
	{
		Bankkonto konto1 = new Bankkonto( "123", "Bob", 100);
		Bankkonto konto2 = new Bankkonto( "007", "James Bond", 50000);
		Bankkonto konto3;
		
		konto1.anzeigen();
		konto2.anzeigen();
		
		konto3 = konto1;
		konto3.anzeigen();
	}

}
