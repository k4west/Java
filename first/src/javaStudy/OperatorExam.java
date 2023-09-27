package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3+1; 더한 후 대입
		System.out.println(i4);
		System.out.println(i3);
		int i5 = i3++; // i3 = i3 + 1; 대입 후 더함
		System.out.println(i5);
		System.out.println(i3);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j); 		   // >>> 2 : 정수형 간의 연산 결과는 정수형임
		System.out.println(i /(double) j); // >>> 2.5
		System.out.println(i % j);
		
	}

}
