package test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner bb = new Scanner(System.in);
		
		int a = bb.nextInt();
		
		if(a % 2 == 0)
			System.out.format("%d �� ¦�� �Դϴ�.", a);
		else 
			System.out.format("%d �� Ȧ�� �Դϴ�.", a);
	}

}
