import java.lang.Exception;
/**
 * 
 * @author vijay
 *
 */

/**
 * 
 * EmptyListException is a user defined exception which throws a message when List object is empty. 
 *
 */
public class EmptyListException extends Exception {
 static final long serialVersionUID = 1L;
/**
 * 
 * @param s is the error message it takes. 
 */
	public EmptyListException(String s) {
		super(s);
	}
}
