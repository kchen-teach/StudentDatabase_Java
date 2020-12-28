package ntu.genedu.java.studentdatabase;
/**
 * 非法成績例外
 * @author kChen
 *
 */
public class IllegalScoreException extends IllegalArgumentException {

	public IllegalScoreException(String message) {
		super(message);
	}
	
}
