package javaStudy;

public class OperatorExam3 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2); // >>> false
		System.out.println(b2 & b3); // >>> false
		System.out.println(b1 | b2); // >>> true
		System.out.println(b1 || b3); // >>> true
		System.out.println(b2 | b2); // >>> false
		
		int score = 68;
		if(score < 100 && score >=70) {
			System.out.println("성공");
		}else {
			System.out.println("실패"); // >>> 실패
		}
		
		System.out.println(b1 ^ b3); // >>> false
		System.out.println(b1 ^ b2); // >>> true
		System.out.println(!b1); // >>> false
	}

}
