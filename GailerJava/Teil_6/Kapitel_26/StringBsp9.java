package Kapitel_26;

public class StringBsp9 {

	public static void main(String[] args) {
		
		String str1 = "ein Stringliteral";
		String str2 = "ein Stringliteral";
		
		String msgA = new String("Aufgepasst");
		String msgB = new String("Aufgepasst");
		
		if (str1 == str2) {
			System.out.println("Dies WIRD ausgegeben.");
			
		} if (str1.equals(str2)) {
			System.out.println("Dies WIRD ausgegeben.");
			
		} if (msgA == msgB) {
			System.out.println("Dies wird NICHT ausgegeben.");
			
		} if (msgA.equals(msgB)) {
			System.out.println("Dies WIRD ausgegeben");
		}
	}
}
