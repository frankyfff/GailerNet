package Kapitel_26;

public class StringBsp8 {

	public static void main(String[] args) {
		
		String strA;
		String strB;
		
		strA = new String("Der Gingham Hund");
		strB = new String("Der Gingham Hund");
		
		if (strA.equals(strB)) {
			System.out.println("Dies wird ausgegeben");
		}
		
		if (strA == strB) {
			System.out.println("Dies wird nicht ausgegeben");
		}
		
		
	}

}
