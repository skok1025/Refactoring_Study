package chapter_6;

public class Introduce_Explaining_Variable {
	// �� ������ �ӽú��� ���
	// 		���� ������ ������ ��,
	// 		������ ����� ������ �Ϻκ��� �뵵�� �����ϴ� �������� �̸��� �ӽú����� ��������.

	public static void main(String[] args) {
		String platform = "MAC";
		String browser = "Chrome";
		int resize = 1;
		
		
		// as-is
		if ((platform.toUpperCase().indexOf("MAC") > -1) &&
			(browser.toUpperCase().indexOf("IE") > -1) &&
			wasInitialized() && 
			resize > 0) {
			// ��� �ڵ�
		}
		
		// to-be
		final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
		final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
		final boolean wasResized = resize > 0;
		
		if (isMacOs && isIEBrowser && wasInitialized() && wasResized) {
			// ����ڵ�
		}
		
	}
	
	public static boolean wasInitialized() {
		return true;
	}
}
