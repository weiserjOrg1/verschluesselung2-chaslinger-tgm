package haslingerCipher;
/** This class creates new exceptions for secret alphabets
 * 
 * @author Christoph Haslinger
 * @version 11-10-2018
 */
public class AlphaExceptions extends Exception {
	public AlphaExceptions() {
		super("The secret alphabet does not match the requirements.");
	}
	public AlphaExceptions(String emsg) {
		super(emsg);
	}
}
