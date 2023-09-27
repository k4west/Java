package javaStudy;

public class OperatorExam2 {

	public static void main(String[] args) {
	    int a = 5;
	    int b = 10;
	    int c = 15;
	    
	    System.out.println(a - b * c); // >>> -145
	    System.out.println((a - b) * c); // >>> -75

	    System.out.println(a > 5 && b > 5); // >>> false && true >>> false
	    System.out.println(a > 5 || b > 5); // >>> false || true >>> true

	    
	    // 증감 연산자일 경우에 전위 연산자인지 후위 연산자 인지에 따라서 우선 순위가 바뀔 수 있다.
	    // 전위 연산자일 경우, ++가 먼저 연산됨
        System.out.println(++a - 5); // >>> (5+1) - 5 >>> 1
	    System.out.println(a); // >>> 6
	    
        // 전위 연산자일 경우, ++가 나중에 연산됨
        System.out.println(a++ - 6); // >>> 6 - 6 >>> 0
        System.out.println(a); // 6+1 >>> 7

	}

}