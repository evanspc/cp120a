package cp120a.evanspc.hw5;

public class MyIllegalArgumentException extends Exception {
	
	private static int numExceptions = 0;

	public MyIllegalArgumentException() {
		super();
	}

	public MyIllegalArgumentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyIllegalArgumentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyIllegalArgumentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MyIllegalArgumentException(String cause) {
		super(cause);
	}

	public void incException() {
		numExceptions++;
	}

	public static int exceptionCount() {
		return numExceptions;
	}

	public static void main(String[] args) {
		try {
			doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
