package test;

import java.util.Scanner;

public class test {
	
	public static void dhtest(int a, int b){
		print(a + b);
	}
	
	public static void bgtest(int a, int b){
		print(a - b);
	}
	
	public static void ghtest(int a, int b){
		print(a * b);
	}
	
	public static void nntest(int a, int b){
		if(b == 0)
			print2();
		
		else if(b != 0)
			print(a / b);
	}
	
	public static void print(int a){
		System.out.format("계산 결과 : %d", a);
	}
	
	public static void print2(){
		System.out.println("0으론 나눌 수 없습니다.");
	}


	public static void main(String[] args) {
		
		Scanner aa = new Scanner(System.in);
		
		System.out.println("계산기 \n");
		System.out.println("두 정수와 기호를 입력하시오. \n 예시 : (숫자) (기호) (숫자) \n");
		
		int num1 = aa.nextInt();
		String tt = aa.next();
		int num2 = aa.nextInt();
		
		switch (tt) {
		case "+":
			dhtest(num1, num2);
			break;
			
		case "-":
			bgtest(num1, num2);
			break;
			
		case "*":
			ghtest(num1, num2);
			break;
			
		case "/":
			nntest(num1, num2);
			break;

		default:
			System.out.println("잘못된 연산자입니다.");
		}
		
		
		
	}

}
