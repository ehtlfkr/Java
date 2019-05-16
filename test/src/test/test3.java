package test;

public class test3 {
	
	public static void formun(int a, int n){
		for(int i = a; i <= 100; i++){
			n+=i;
		}
		
		System.out.format("for문 1~100 더하기 : %d \n", n);
	}
	
	public static void whilemun(int a, int n){
		while(a <= 100){
			n +=a;
			a+=1;
		}
		
		System.out.format("while문 1~100 더하기 : %d \n", n);
	}

	public static void domun(int a, int n){
		do{
			n +=a;
			a+=1;
		}
		
		while(a <= 100);
		
		System.out.format("do while문 1~100 더하기 : %d \n", n);
	}

	public static void main(String[] args) {
		int a = 1;
		int n = 0;
		
		formun(a, n);
		
		whilemun(a, n);
		
		domun(a, n);
		

	}

}
