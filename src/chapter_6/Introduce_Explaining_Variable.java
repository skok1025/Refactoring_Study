package chapter_6;

public class Introduce_Explaining_Variable {
	// ※ 직관적 임시변수 사용
	// 		사용된 수식이 복잡할 땐,
	// 		수식의 결과나 수식의 일부분을 용도에 부합하는 직관적인 이름의 임시변수를 대입하자.

	public static void main(String[] args) {
		String platform = "MAC";
		String browser = "Chrome";
		int resize = 1;
		
		
		// as-is
		if ((platform.toUpperCase().indexOf("MAC") > -1) &&
			(browser.toUpperCase().indexOf("IE") > -1) &&
			wasInitialized() && 
			resize > 0) {
			// 기능 코드
		}
		
		// to-be
		final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
		final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
		final boolean wasResized = resize > 0;
		
		if (isMacOs && isIEBrowser && wasInitialized() && wasResized) {
			// 기능코드
		}
		
	}
	
	public static boolean wasInitialized() {
		return true;
	}
}
