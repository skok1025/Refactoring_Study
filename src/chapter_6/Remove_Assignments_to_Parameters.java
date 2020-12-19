package chapter_6;

public class Remove_Assignments_to_Parameters {
	// ※ 매개변수의 값 대입 제거
	// 		매개변수로 값을 대입하는 코드가 있을 땐
	//		매개변수 대신 임시변수를 사용하게 수정하자.
	
	int discount_asis(int inputVal, int quantity, int yearToDate) {
		if (inputVal > 50) inputVal -= 2; // 이 순간 용도의 일관성이 깨짐. (inputVal 은 입력값을 나타내는 변수인데.. 계산을 해버리다니) 
		if (quantity > 100) inputVal -= 1;
		if (yearToDate > 10000) inputVal -= 4;
		
		return inputVal;
	}
	
	int discount_tobe(int inputVal, int quantity, int yearToDate) {
		int result = inputVal;
		
		if (inputVal > 50) result -= 2;
		if (quantity > 100) result -= 1;
		if (yearToDate > 10000) result -= 4;
		
		return result;
	}

}
