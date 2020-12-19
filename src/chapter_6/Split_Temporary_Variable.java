package chapter_6;

public class Split_Temporary_Variable {
	// �� �ӽú��� �и�
	// 		���������� �� ������ �ӽú����� �ƴ� �ӽú����� ���� �� ���� ���Ե� ��,
	//  	�� ���Ը��� �ٸ� �ӽú����� �������.
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
