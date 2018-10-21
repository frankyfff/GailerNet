package Kapitel_26;

public class StringliteralBsp {

	public static void main(String[] args) {
		
		String str1 = "Stringliteral";
		String str2 = "Stringliteral";
		
		String msgA = new String("Aufgepasst!");
		String msgB = new String("Aufgepasst!");
		
		if (str1 == str2) {
			System.out.println("Das WIRD ausgegeben.");
		}
		if (msgA == msgB) {
			System.out.println("Das wird NICHT ausgegeben.");
		}
	}

}
