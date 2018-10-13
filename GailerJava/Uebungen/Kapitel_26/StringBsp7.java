package Kapitel_26;

public class StringBsp7 {

	public static void main(String[] args) {
		
		String strA;
		String strB;
		
		strA = new String("Der Gingham Hund");
		System.out.println(strA);
		
		strB = new String("Der Gingham Hund");
		System.out.println(strB);
		
		if (strA == strB) {
			System.out.println("Dies wird nicht ausgegeben werden.");
		}

	}

}
