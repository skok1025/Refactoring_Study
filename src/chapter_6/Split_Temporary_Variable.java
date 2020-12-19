package chapter_6;

public class Split_Temporary_Variable {
	// ※ 임시변수 분리
	// 		루프변수나 값 누적용 임시변수가 아닌 임시변수에 여러 번 값이 대입될 땐,
	//  	각 대입마다 다른 임시변수를 사용하자.
	public static void main(String[] args) {
		int _height = 175;
		int _width = 100;
		
		// as-is
		double temp = 2 * (_height + _width);
		System.out.println(temp);
		
		temp = _height * _width;
		System.out.println(temp);
		
		// to-be
		final double perimeter = 2 * (_height + _width);
		System.out.println(perimeter);
		
		final double area = _height * _width;
		System.out.println(area);
	}

}
