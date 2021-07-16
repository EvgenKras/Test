
public class CheckInException extends Exception{

	public CheckInException() {
		super();
		System.exit(0);
	}

	public CheckInException(String message) {
		super(message);
		System.out.println(message);
		System.exit(0);
	}

}
