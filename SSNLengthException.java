public class SSNLengthException extends Exception{
	public SSNLengthException() {
		super("Social security number is either too long or not long enough.");
	}
}

class SSNCharacterException extends Exception {
	public SSNCharacterException() {
		super("A non-digit character was entered.");
	}
}
