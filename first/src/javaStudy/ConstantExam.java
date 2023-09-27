package javaStudy;

public class ConstantExam {

	public static void main(String[] args) {
		int i;
		i = 10;
		i = 5;
		
		/* 변수 타입 선언 앞에 final을 붙여주면 상수가 됨
		 * 상수는 변수처럼 값을 변경 할 수 없음
		 * 상수명 - snake case
		 * 상수명은 대문자로만 구성된 명사로 명명
		 * 여러 단어로 구성된 이름은 단어 사이를 '_'로 구분*/
		
		final int J;
		J = 10;
//		J = 5;
		
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI;
		
//		final int OIL_PRICE = 1450;
		/* 반복해서 사용된 값을 수정해야할 때, 
		 * 상수로 사용하면 편리함 */
		
		final int OIL_PRICE = 1390;
		
		int totalPrice = 50 * OIL_PRICE;
		

	}

}
