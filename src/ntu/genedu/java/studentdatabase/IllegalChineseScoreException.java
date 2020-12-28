package ntu.genedu.java.studentdatabase;
/**
 * 非法的國文成績例外
 * @author kChen
 *
 */
public class IllegalChineseScoreException extends IllegalScoreException {

	public IllegalChineseScoreException(String message) {
		super(message);
	}

	public IllegalChineseScoreException() {
		super("非法的國文成績");
	}
}
