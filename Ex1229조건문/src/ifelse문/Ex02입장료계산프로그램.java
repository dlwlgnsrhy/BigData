package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {
System.out.println("====에버랜드에 오신 걸 환영합니다!====");

Scanner sc =new Scanner(System.in);

System.out.print("나이를 입력하세요 :");
int age =sc.nextInt();		
		
System.out.print("인원수를 입력하세요 :");
int group =sc.nextInt();

if(age<20) {System.out.println("총"+group*2500+"원입니다.");
	
}else {System.out.println("총"+group*5000+"원입니다.");
}

		
		//2안
//1.입력도구 꺼내오기 scan~
//2. 나이 입력받기 age
//3.인원수 입력받기 people
//4.입장료 계산하기 if(age<20){int money = (int)(5000*people*0.5);}else{ money = 5000*people;}
//4-1 20세 미만일 경우 50퍼 할인
//4-2 그렇지 않은경우 그대로
//5 결과 출력하기 System.out.print("입장료는" +money + "원 입니다.");
  
		
		//지역변수(local variable)
//:{} 영역 안에서 선언된 변수는 {}영역 안쪽에서만 사용이 가능하다!
//--- > {}:scope영역 이라고도 한다

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
