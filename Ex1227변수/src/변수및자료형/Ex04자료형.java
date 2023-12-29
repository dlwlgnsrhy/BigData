package 변수및자료형;

public class Ex04자료형 {

	public static void main(String[] args) {

		
		
		//자바의 기본 자료형
		// 1) 논리 자료형 : boolean (1byte)
		//:참 또는 거짓을 저장하는 자료형
		//참이라는 데이터를 저장하는 bool 변수 선언
		boolean bool = true;
		bool = false;
		System.out.println(bool);
		
		char name = '이';//한글자밖에 넣지못함 '를 씀
		System.out.println(name);
		
		//문자열 자료형 (기본 자료형이 아님!!)한글자가 불편해!! 할때 쓰는것
		//String : 쌍따옴표를 이용해서 작성하고 , 여러글자가 들어갈 수 있다.
		String name2 = "이지훈";
		System.out.println(name2);
		System.out.println();
		
		//정수 자료형 byte short int long 1,2,4,8 byte 를 가지고있다.
		//ㄴ 데이터의 크기가 의미하는 건 표현할 수 있는 범위!
		//정수를 작성하면 java는 기본적으로 int로 인식!
		
		
		
		//1.강제 형변환 (명시적 형변환 ) 큰>작은
		//데이터 손실이 발생할수 있기 때문에 정확하게 () 사용해서 손실이 일어나도 괜찮다고 명시해주는 방식
		byte num1 = (byte) 128;//cast=형변환 개념 
		System.out.println(num1);//-128
	
		//2. 자동 형변환(묵시적 형변환)
	       //작은 크기의 자료형이 자동으로 큰 크기의 자료형으로 형 변환
		long num2 = 100;
		System.out.println(num2);//ctrl alt 위아래 방향키 누르면 복사됨
		System.out.println(num2);
		System.out.println(num2);
		
		// 실수형 
		//float-4 double-8 기본값 double로 설정
	    // 3.14 라는 double이라는 형태의 변수 num3 선언
		double num3 = 3.14;
		System.out.println(num3);//3.14
		
		float num4 = (float) 3.14;
		System.out.println(num4);//3.14
		
		float num5 = 3.14f; //3.14 값 뒤에 f만 입력해도 해결완료
		System.out.println(num5);//3.14
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
