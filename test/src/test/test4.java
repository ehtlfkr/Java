package test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner bb = new Scanner(System.in);
		
		int a = bb.nextInt();
		
		if(a % 2 == 0)
			System.out.format("%d 는 짝수 입니다.", a);
		else 
			System.out.format("%d 는 홀수 입니다.", a);
	}

}
