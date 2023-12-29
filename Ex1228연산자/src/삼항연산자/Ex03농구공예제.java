package 삼항연산자;

import java.util.Scanner;

public class Ex03농구공예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
//		int result = ball%5+1;
		int result = ball%5==0? ball/5 :ball/5+1;
		
		System.out.println("필요한 상자의 수 :" +result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
