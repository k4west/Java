package javaStudy;

public class IfExam {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
		if (x < y ) {
			System.out.println("x는 y보다 작습니다.");
			System.out.println("test1");
		}
		
		/* {중괄호}로 묶지 않으면 
		 * if 문에 포함되는 실행문은 
		 * 한 줄만 포함됩니다.*/
		if (x > y )
			System.out.println("x.");
			System.out.println("test2");
			
		if (x==y ) {
			System.out.println("x는 y와 같습니다.");
		} else if (x < y ){
			System.out.println("x는 y 보다 작습니다.");
		} else {
			System.out.println("x는 y와 다릅니다.");
		}
		
	}

}
