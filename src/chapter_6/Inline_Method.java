package chapter_6;

public class Inline_Method {
	
	private int _numberOfLateDeliveries = 6;
	// �� �޼ҵ� ���� ���� ����
	// 		�޼ҵ� ����� �ܼ��ؼ� �޼ҵ�� ���� �ʹ� ���Ҷ� 
	// 	        �� �޼ҵ��� ����� ���� �޼ҵ忡 �־������ �޼ҵ� �����ع���.
	
	// AS-IS
	int getRating_asis() {
		return (moreThanFiveLateDeliveries()) ? 2 : 1;
	}
	
	boolean moreThanFiveLateDeliveries() {
		return _numberOfLateDeliveries > 5;
	}
	
	// TO-BE
	int getRating_tobe() {
		return (_numberOfLateDeliveries > 5) ? 2 : 1; 
	}

}
