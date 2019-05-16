package test;

import java.util.Scanner;


class dh{
	public int dhtest(int a, int b){
		return a+b;
		
	}
}

class bg{
	public int bgtest(int a, int b){
		return a-b;
	}
}

class gh{
	public int ghtest(int a, int b){
		return a*b;
	}
}

class nn{
	public int nntest(int a, int b){
		return a-b;
	}
}

public class test {
	
	public static void printZ(){
		System.out.println("0으론 나눌 수 없습니다.");
	}
	
	public static void printB(){
		System.out.println("나누는 숫자가 너무 큽니다.");
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
			dh dh = new dh();
			System.out.format("계산 결과 : %d", dh.dhtest(num1, num2));
			
			break;
			
		case "-":
			bg bg = new bg();
			System.out.format("계산 결과 : %d", bg.bgtest(num1, num2));
			
			break;
			
		case "*":
			gh gh = new gh();
			System.out.format("계산 결과 : %d", gh.ghtest(num1, num2));
			
			break;
			
		case "/":
			nn nn = new nn();
			if(num1 < num2)
				printB();
			
			else if(num2 != 0)
				System.out.format("계산 결과 : %d", nn.nntest(num1, num2));
			
			else if(num2 == 0)
				printZ();
			
			break;

		default:
			System.out.println("잘못된 연산자입니다.");
		}
		
		
		
	}

}
