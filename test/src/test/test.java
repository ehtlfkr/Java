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
		System.out.println("0���� ���� �� �����ϴ�.");
	}
	
	public static void printB(){
		System.out.println("������ ���ڰ� �ʹ� Ů�ϴ�.");
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
			dh dh = new dh();
			System.out.format("��� ��� : %d", dh.dhtest(num1, num2));
			
			break;
			
		case "-":
			bg bg = new bg();
			System.out.format("��� ��� : %d", bg.bgtest(num1, num2));
			
			break;
			
		case "*":
			gh gh = new gh();
			System.out.format("��� ��� : %d", gh.ghtest(num1, num2));
			
			break;
			
		case "/":
			nn nn = new nn();
			if(num1 < num2)
				printB();
			
			else if(num2 != 0)
				System.out.format("��� ��� : %d", nn.nntest(num1, num2));
			
			else if(num2 == 0)
				printZ();
			
			break;

		default:
			System.out.println("�߸��� �������Դϴ�.");
		}
		
		
		
	}

}
