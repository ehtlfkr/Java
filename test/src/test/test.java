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
		System.out.format("��� ��� : %d", a);
	}
	
	public static void print2(){
		System.out.println("0���� ���� �� �����ϴ�.");
	}


	public static void main(String[] args) {
		
		Scanner aa = new Scanner(System.in);
		
		System.out.println("���� \n");
		System.out.println("�� ������ ��ȣ�� �Է��Ͻÿ�. \n ���� : (����) (��ȣ) (����) \n");
		
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
			System.out.println("�߸��� �������Դϴ�.");
		}
		
		
		
	}

}
