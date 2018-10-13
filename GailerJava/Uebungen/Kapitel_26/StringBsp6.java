package Kapitel_26;

public class StringBsp6 {

	public static void main(String[] args) {
		
		String strA;
		String strB;
		
		strA = new String("Der Gingham Hund");
		System.out.println(strA);
		
		strB = strA;
		
		System.out.println(strB);
		
		if (strA == strB) {
			System.out.println("Die gleiche Information in jeder der Referenzvairablen.");
		}


	}

}
