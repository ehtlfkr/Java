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
		
		System.out.println("����� �̸��� �����ּ���.");
		userA = scanner.next();
		
		System.out.println("������ �����ϱ⿡ �ռ� �� ������ ���� ���������� �����̸� \n3�� 2���� �������� ���ص帳�ϴ�.\n");
		System.out.println("���������� ������ �����Ͻðڽ��ϱ�? (yes/no)");
		String anser = 	scanner.next();
		
		if(anser == "no") {
			System.out.println("������ �����մϴ�.");
			System.exit(0);
		}
		
		while (gameCuont < 3) {
			gameCuont += 1;
			
			System.out.println("(����/����/��) �� �ϳ��� �Է����ֽʽÿ�.\n");
			String Arsp = scanner.next();
			String Brsp[] = {"����", "����", "��"};
			
			int rspA = 0;
			int rspB = random.nextInt(3);
			
			switch (Arsp) {
			
				case "����" : rspA = 0;
					if(rspA == rspB) { //�������
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println("�����ϴ�. \n");
						System.out.println(userA + "���� �̱� Ƚ�� : " + Awin + "\n" + userB + "���� �̱� Ƚ�� : "+ Bwin);
						
					}else if(rspA == 0 && rspB == 1) { //���� �� ����
						Bwin += 1;
						System.out.println(userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userB + "���� �̰���ϴ�. \n");
						System.out.println(userA + "���� �̱� Ƚ�� : " + Awin + "\n" + userB + "���� �̱� Ƚ�� : "+ Bwin);
					}else if(rspA == 0 && rspB == 2) { //���� �� ��
						Awin += 1;
						System.out.println(userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userA + "���� �̰���ϴ�. \n");
						System.out.println(userA + "���� �̱� Ƚ�� : " + Awin + "\n" + userB + "���� �̱� Ƚ�� : "+ Bwin);
					}
					break;
				
				case "����" : rspA = 1;
					if(rspA == rspB) { //�������
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println("�����ϴ�. \n");
						System.out.println(userA + "���� �̱� Ƚ�� : " + Awin + "\n" + userB + "���� �̱� Ƚ�� : "+ Bwin);
						
					}else if(rspA == 1 && rspB == 0) { //���� �� ����
						Awin += 1;
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userB + "���� �̰���ϴ�. \n");
						System.out.println(userA + "���� �̱� Ƚ�� : " + Awin + "\n" + userB + "���� �̱� Ƚ�� : "+ Bwin);
						
					}else if(rspA == 1 && rspB == 2) { //���� �� ��
						Bwin += 1;
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userB + "���� �̰���ϴ�. \n");
						System.out.println(userA + "���� �̱� Ƚ�� : " + Awin + "\n" + userB + "���� �̱� Ƚ�� : "+ Bwin);
					}
					break;
				
				case "��" : rspA = 2;
					if(rspA == rspB) { //�������
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println("�����ϴ�. \n");
						System.out.println(userA + "���� �̱� Ƚ�� : " + Awin + "\n" + userB + "���� �̱� Ƚ�� : "+ Bwin);
					
					}else if(rspA == 2 && rspB == 0) { //�� �� ����
						Bwin += 1;
						System.out.println( userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userB + "���� �̰���ϴ�. \n");
						System.out.println(userA + "���� �̱� Ƚ�� : " + Awin + "\n" + userB + "���� �̱� Ƚ�� : "+ Bwin);
						
					}else if(rspA == 2 && rspB == 1) { //�� �� ����
						Awin += 1;
						System.out.println(userA + " : " + Arsp + "\n" + userB + " : "+ Brsp[rspB] );
						System.out.println(userA + "���� �̰���ϴ�. \n");
						System.out.println(userA + "���� �̱� Ƚ�� : " + Awin + "\n" + userB + "���� �̱� Ƚ�� : "+ Bwin);

					}
					break;
	
				default:
					System.out.println("�ù߷þ� �׳� ������ ���� \n");
					System.exit(0);
			}
			
		}
		
		if(Awin > Bwin) {
			System.out.println("�������� \n" + Awin + " : " + Bwin + "���� " + userA + "���� �¸��Դϴ�. \n");
			System.out.println("������ �����մϴ�.");
			System.exit(0);
			
		}else if(Awin < Bwin) {
			System.out.println("�������� \n" + Awin + " : " + Bwin + "���� " + userB + "���� �¸��Դϴ�. \n");
			System.out.println("������ �����մϴ�.");
			System.exit(0);
			
		}else if(Awin == Bwin) {
			System.out.println("�������� \n" + Awin + " : " + Bwin + "(��)��  �����ϴ�.\n");
			System.out.println("������ �����մϴ�.");
			System.exit(0);
			
		}
		
		
	}

	public static void main(String[] args) {
		new RSPGame();
	}

}
