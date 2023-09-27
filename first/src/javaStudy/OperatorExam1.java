package javaStudy;

public class OperatorExam1 {

	public static void main(String[] args) {
		int i = 10; // 단순 대입 연산자
		int j = 10;
		
	    // i 와 j 가 같은지 비교 하는 비교 연산자           
	    System.out.println(i == j); // >>> true
	    System.out.println(i != j ); // >>> false
	    System.out.println(i < j); // >>> false
	    System.out.println( i <= j); // >>> true
	    System.out.println(i > j); // >>> false
	    System.out.println(i >= j); // >>> true

	    i += 10; // i = i + 10;  과 같은 의미 

	    System.out.println(i); // >>> 20
	    System.out.println(i -=5); // >>> 15 
	    System.out.println(i); // >>> 15
	}

}
