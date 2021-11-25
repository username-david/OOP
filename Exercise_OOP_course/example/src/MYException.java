
public class MYException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MYException(String message) {
		super(message);
		System.out.println("MYException -- "+ message);
	}

}
