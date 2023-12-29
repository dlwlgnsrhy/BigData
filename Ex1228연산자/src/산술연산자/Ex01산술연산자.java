package 산술연산자;

public class Ex01산술연산자 {

	public static void main(String[] args) {

		//산술 연산자
		//피연산자와 연산자 로 이루어진 식 
		 //a,b      +-*%/
		//이항 연산자(산술 대입 논리) ,단항 연산자() , 삼항 연산자 
		// / :몫 , % : 나머지
		int num1 = 10;
		float num2 = 7f;
		System.out.println(num1);//10
		System.out.println(num2);//7.0
		System.out.println(num1/num2);//1.4285714285714286
		System.out.println(num1%num2);//3.0
		System.out.println(num2%num1);//7.0
		System.out.println(num2/num1);//0.7
		
		// 결론 :정수 와 실수 로 값을 구하게되면 순서에 상관없이 실수값이 크기가 더크기 떄문에 실수 값으로 나온다.(암묵적 형 변환)
		//추가 내용 : float와 double 둘다 사용가능 <<ctr alt 위아래 진짜 편하다bb>>
		//+ : 더하기 뿐만 아니라 연결 연산 이라고 한다.
		int num3 = 10 ;
		String num4 = "7";
		System.out.println(num3+num4);//107 문자와 숫자를 더하게되면 연산이되지않고 '연결'이 된다.결과값은 문자 자료형이 된다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
