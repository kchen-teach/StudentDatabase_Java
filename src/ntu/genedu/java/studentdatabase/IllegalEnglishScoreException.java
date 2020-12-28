package ntu.genedu.java.studentdatabase;
/**
 * 非法的英文成績例外
 * @author kChen
 *
 */
public class IllegalEnglishScoreException extends IllegalScoreException {
	public IllegalEnglishScoreException(String message) {
		super(message);
	}

	public IllegalEnglishScoreException() {
		super("非法的英文成績");
	}
}
