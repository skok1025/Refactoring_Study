package chapter_6;

public class Inline_Temp {
	// ※ 임시변수 내용 직접 삽입
	// 		간단한 수식을 대입받는 임시변수로 인해 다른 리팩토링 기법 적용이 힘들 땐 
    //		그 임시변수를 참조하는 부분을 전부 수식으로 치환

	boolean getPriceOver_asis() {
		double basePrice = getPrice();
		return (basePrice > 1000);
	}
	
	boolean getPriceOver_tobe() {
		return (getPrice() > 1000);
	}
	
	int getPrice() { 
		return 10000;
	}
	
}
