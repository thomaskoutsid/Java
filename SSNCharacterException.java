public class SSNCharacterException extends Exception {
	public SSNCharacterException() {
		super("A non-digit character was entered.");
	}
}
