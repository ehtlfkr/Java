import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;

import javax.imageio.*;
import javax.swing.*;

public class GalagaGame extends JPanel implements KeyListener {

	private boolean running = true;
	
	int Score = 0;

	private ArrayList sprites = new ArrayList();
	private Sprite starship;

	private BufferedImage alienImage;
	private BufferedImage shotImage;
	private BufferedImage shipImage;

	public GalagaGame() {
		JFrame frame = new JFrame("Galaga Game");

		frame.setSize(800, 600);
		frame.add(this);
		frame.setResizable(false);
		frame.setVisible(true);
		
		JPanel ssss = new JPanel();
		
		JLabel aaa = new JLabel("스코어 : " + Score);
		aaa.setOpaque(true);
		aaa.setForeground(Color.WHITE);
		
		ssss.add(aaa);
		
		
		frame.add(ssss);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			shotImage = ImageIO.read(new File("fire.png"));
			shipImage = ImageIO.read(new File("starship.png"));
			alienImage = ImageIO.read(new File("alien.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		this.requestFocus();
		this.initSprites();
		addKeyListener(this);

	}

	private void initSprites() {
		starship = new StarShipSprite(this, shipImage, 370, 550);
		sprites.add(starship);
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 12; x++) {
				Sprite alien = new AlienSprite(this, alienImage, 100 + (x * 50), (50) + y * 30);
				sprites.add(alien);
			}
		}
	}

	private void startGame() {
		int a = 0;
		sprites.clear();
		initSprites();
		newwin(a);
		Score = 0;
	}
	
	public void newwin(int a) {
		if(a == 1){
			new newWindow();
		}
	}
	
	public void reGame() {
		int a = 0;
		sprites.clear();
		initSprites();
		newwin(a);
		Score = 0;
	}

	public void endGame() {
		System.exit(0);
	}

	public void removeSprite(Sprite sprite) {
		sprites.remove(sprite);
		Score += 10;
		/*if(sprites.remove(alienImage)){
			Score += 10;
		}*/
	}

	public void fire() {
		ShotSprite shot = new ShotSprite(this, shotImage, starship.getX() + 10, starship.getY() - 30);
		sprites.add(shot);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 600);
		for (int i = 0; i < sprites.size(); i++) {
			Sprite sprite = (Sprite) sprites.get(i);
			sprite.draw(g);
		}
	}

	public void gameLoop() {

		while (running) {
			for (int i = 0; i < sprites.size(); i++) {
				Sprite sprite = (Sprite) sprites.get(i);
				sprite.move();
			}

			for (int p = 0; p < sprites.size(); p++) {
				for (int s = p + 1; s < sprites.size(); s++) {
				   	Sprite me = (Sprite) sprites.get(p);
					Sprite other = (Sprite) sprites.get(s);

					if (me.checkCollision(other)) {
						me.handleCollision(other);
						other.handleCollision(me);
					}
				}
			}

			repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			starship.setDx(-3);
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			starship.setDx(+3);
		if (e.getKeyCode() == KeyEvent.VK_UP)
			starship.setDy(-3);
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			starship.setDy(+3);
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
			fire();
		if (e.getKeyCode() == KeyEvent.VK_R)
			new stopwin();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			starship.setDx(0);
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			starship.setDx(0);
		if (e.getKeyCode() == KeyEvent.VK_UP)
			starship.setDy(0);
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			starship.setDy(0  );
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	public static void main(String argv[]) {
		GalagaGame g = new GalagaGame();
		g.gameLoop();
	}
	
	class newWindow extends JFrame {
	    newWindow() {
	        setTitle("게임 메세지");
	        
	        JPanel NewWindowContainer = new JPanel();
	        setContentPane(NewWindowContainer);
	        
	        JLabel Score1 = new JLabel("최종 스코어 : " + Score);
	        
	        JLabel NewLabel = new JLabel("<html><center>게임을 종료 하시겠다면  End,<br>새로 하시겠다면 Regame를 눌러주세요.</center></html>");
	        
	        JButton end = new JButton("End");
	        JButton regame = new JButton("Regame");
	        
	        end.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					endGame();
					
				}
			});
	        
	        regame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reGame();
					setVisible(false);
					
				}
			});
	        
	        NewWindowContainer.add(end);
	        NewWindowContainer.add(regame);
	        NewWindowContainer.add(NewLabel);
	        NewWindowContainer.add(Score1);
	        
	        setSize(300,150);
	        setResizable(false);
	        setVisible(true);
	    }
	}
	
	class stopwin extends JFrame {
		stopwin() {
	        setTitle("게임 메세지");
	        
	        JPanel NewWindowContainer = new JPanel();
	        setContentPane(NewWindowContainer);
	        
	        JLabel NewLabel = new JLabel("<html><center>게임을 종료 하시겠다면  End,<br>계속 하시겠다면 go,<br> 새로 하시겠rr다면 Regame을 눌러주세요.</center></html>");
	        
	        JButton end = new JButton("End");
	        JButton regame = new JButton("Regame");
	        JButton go = new JButton("go");
	        
	        end.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					endGame();
					
				}
			});
	        
	        regame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reGame();
					setVisible(false);
					
				}
			});
	        
	        go.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					
				}
			});
	        
	        NewWindowContainer.add(end);
	        NewWindowContainer.add(go);
	        NewWindowContainer.add(regame);
	        NewWindowContainer.add(NewLabel);
	        
	        setSize(300,150);
	        setResizable(false);
	        setVisible(true);
	    }
	}
	
}