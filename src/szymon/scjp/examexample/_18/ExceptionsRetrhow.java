package szymon.scjp.examexample._18;

public class ExceptionsRetrhow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				throw new Exception();
			} catch (Exception e2) {
				System.out.print("inner ");
			}
			System.out.print("middle ");
		}
		System.out.print("outer ");
	}

}
