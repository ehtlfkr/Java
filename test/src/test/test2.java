package test;

public class test2 {

	public static void main(String[] args) {
		System.out.println("구구단 \n");
		
		for(int i = 1; i <= 9; i++){
			System.out.format("%d단\n", i );
			for(int j = 1; j <= 9; j++){
				System.out.format("%d x %d = %d \n", i, j, i*j );
			}
			System.out.println("\n");
		}

	}

}
