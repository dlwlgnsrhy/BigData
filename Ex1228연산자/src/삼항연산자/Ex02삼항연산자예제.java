package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int num1 =sc.nextInt();
		String result = num1%2==0 ? "는(은) 짝수입니다." : "는(은) 홀수입니다.";
        System.out.print(num1 + result);
        
        //2안) System.out.println(num1 + "은(는)"+result +"입니다.");
        
        
        
        if(num1%2==0) {System.out.println("짝수");
        	}else {System.out.println("홀수");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
