package haslingerCipher;
/** This class tests the encrypt and decrypt function of MonoAlphabeticCipher
 * 
 * @author Christoph Haslinger
 * @version 11-10-2018
 */
public class testClass {
	public static void main(String[] args) {	
		try {
			SubstitutionCipher s = new SubstitutionCipher("qwertzuiop���lkjhgfdsayxcvbn�m");
			String text = s.encrypt("abcdefghijklmnopqrstuvwxyz����");
			System.out.println(text);
			System.out.println(s.decrypt(text));
		}catch(AlphaException e) {
			System.out.println(e.toString());
		}
	}
}
