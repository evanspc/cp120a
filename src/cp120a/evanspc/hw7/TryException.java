package cp120a.evanspc.hw7;

class MyException extends Exception {

	public MyException(String cause) {
		super(cause);
	}
}

public class TryException {
	public static void main(String[] argc) {
		try {
			doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void doIt() throws Exception {
		Exception e = new MyException("something happens!");
		throw e;
	}
}

