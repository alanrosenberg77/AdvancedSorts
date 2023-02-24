package code;

@SuppressWarnings("serial")
public class EmptyArrayException extends Exception {

	public EmptyArrayException() {
		System.err.println("Cannot sort an empty list");
		this.printStackTrace();
	}
}
