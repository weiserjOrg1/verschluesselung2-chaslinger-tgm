package haslingerCipher;
/** This class tests the encrypt and decrypt function of SubstitutionCipher and ShiftCipher
 * 
 * @author Christoph Haslinger
 * @version 11-10-2018
 */
public class testClass {
	public static void main(String[] args) {
		System.out.println("Testing SubstitutionCipher");
		try {
			SubstitutionCipher s = new SubstitutionCipher("qwertzuiopüäölkjhgfdsayxcvbnßm");
			String text = s.encrypt("abcdefghijklmnopqrstuvwxyzäöüß");
			System.out.println("\tencrypted text:");
			System.out.println("\t\t" + text);
			System.out.println("\tdecrypted text:");
			System.out.println("\t\t" + s.decrypt(text));
		}catch(AlphaException e) {
			System.out.println(e.toString());
		}
		System.out.println("//////////////////////////////////////////////////");
		System.out.println("Testing ShiftCipher");
		try {
			ShiftCipher s = new ShiftCipher(-33);
			String text = s.encrypt("abcdefghijklmnopqrstuvwxyzäöüß");
			System.out.println("\tencrypted text:");
			System.out.println("\t\t" + text);
			System.out.println("\tdecrypted text:");
			System.out.println("\t\t" + s.decrypt(text));
		}catch(AlphaException e) {
			System.out.println(e.toString());
		}
		
		CiController c1 = new CiController();
	}
}
