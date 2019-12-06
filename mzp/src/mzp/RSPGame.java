package mzp;

import java.util.*;

public class RSPGame {
	
	private String userA;
	private String userB = "System";
	
	private int Awin = 0;
	private int Bwin = 0;
	
	
	public RSPGame() {
		 
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int gameCuont = 0;
		
		System.out.println("당신의 이름을 정해주세요.");
		userA = scanner.next();
		
		System.out.println("게임을 시작하기에 앞서 이 게임은 랜덤 가위바위보 게임이며 \n3판 2선승 게임임을 전해드립니다.\n");
		System.out.println("가위바위보 게임을 시작하시겠습니까? (yes/no)");
		String anser = 	scanner.next();
		
		if(anser == "no") {
			System.out.println("게임을 종료합니다.");
			System.exit(0);
		}
		
		while (gameCuont < 3) {
			gameCuont += 1;
			
			System.out.println("(가위/바위/보) 중 하나를 입력해주십시오.\n");
			String Arsp = scanner.next();
			String Brsp[] = {"가위", "바위", "보"};
			
			int rspA = 0;
			int rspB = random.nextInt(3);
			
			switch (Arsp) {
			
				case "가위" : rspA = 0;
					if(rspA == rspB) { //비겼을때
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println("비겼습니다. \n");
						System.out.println(userA + "님이 이긴 횟수 : " + Awin + "\n" + userB + "님이 이긴 횟수 : "+ Bwin);
						
					}else if(rspA == 0 && rspB == 1) { //가위 와 바위
						Bwin += 1;
						System.out.println(userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userB + "님이 이겼습니다. \n");
						System.out.println(userA + "님이 이긴 횟수 : " + Awin + "\n" + userB + "님이 이긴 횟수 : "+ Bwin);
					}else if(rspA == 0 && rspB == 2) { //가위 와 보
						Awin += 1;
						System.out.println(userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userA + "님이 이겼습니다. \n");
						System.out.println(userA + "님이 이긴 횟수 : " + Awin + "\n" + userB + "님이 이긴 횟수 : "+ Bwin);
					}
					break;
				
				case "바위" : rspA = 1;
					if(rspA == rspB) { //비겼을때
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println("비겼습니다. \n");
						System.out.println(userA + "님이 이긴 횟수 : " + Awin + "\n" + userB + "님이 이긴 횟수 : "+ Bwin);
						
					}else if(rspA == 1 && rspB == 0) { //바위 와 가위
						Awin += 1;
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userB + "님이 이겼습니다. \n");
						System.out.println(userA + "님이 이긴 횟수 : " + Awin + "\n" + userB + "님이 이긴 횟수 : "+ Bwin);
						
					}else if(rspA == 1 && rspB == 2) { //바위 와 보
						Bwin += 1;
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userB + "님이 이겼습니다. \n");
						System.out.println(userA + "님이 이긴 횟수 : " + Awin + "\n" + userB + "님이 이긴 횟수 : "+ Bwin);
					}
					break;
				
				case "보" : rspA = 2;
					if(rspA == rspB) { //비겼을때
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println("비겼습니다. \n");
						System.out.println(userA + "님이 이긴 횟수 : " + Awin + "\n" + userB + "님이 이긴 횟수 : "+ Bwin);
					
					}else if(rspA == 2 && rspB == 0) { //보 와 가위
						Bwin += 1;
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userB + "님이 이겼습니다. \n");
						System.out.println(userA + "님이 이긴 횟수 : " + Awin + "\n" + userB + "님이 이긴 횟수 : "+ Bwin);
						
					}else if(rspA == 2 && rspB == 1) { //보 와 바위
						Awin += 1;
						System.out.println(userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userA + "님이 이겼습니다. \n");
						System.out.println(userA + "님이 이긴 횟수 : " + Awin + "\n" + userB + "님이 이긴 횟수 : "+ Bwin);

					}
					break;
	
				default:
					System.out.println("시발련아 그냥 하지마 ㅅㅂ \n");
					System.exit(0);
			}
			
		}
		
		if(Awin > Bwin) {
			System.out.println("최종승자 \n" + Awin + " : " + Bwin + "으로 " + userA + "님의 승리입니다. \n");
			System.out.println("게임을 종료합니다.");
			System.exit(0);
			
		}else if(Awin < Bwin) {
			System.out.println("최종승자 \n" + Awin + " : " + Bwin + "으로 " + userB + "님의 승리입니다. \n");
			System.out.println("게임을 종료합니다.");
			System.exit(0);
			
		}else if(Awin == Bwin) {
			System.out.println("최종승자 \n" + Awin + " : " + Bwin + "(으)로  비겼습니다.\n");
			System.out.println("게임을 종료합니다.");
			System.exit(0);
			
		}
		
		
	}

	public static void main(String[] args) {
		new RSPGame();
	}

}
