package chapter_6;

public class Inline_Method {
	
	private int _numberOfLateDeliveries = 6;
	// ※ 메소드 내용 직접 삽입
	// 		메소드 기능이 단순해서 메소드명만 봐도 너무 뻔할땐 
	// 	        그 메소드의 기능을 직접 메소드에 넣어버리고 메소드 삭제해버림.
	
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
