import java.awt.*;
import javax.swing.*;

public class ShotSprite extends Sprite {
	private GalagaGame game;

	public ShotSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dy = -10;
	}

	@Override
	public void move() {
		super.move();
		if (y < -100) {
			game.removeSprite(this);
		}
	}

	@Override
	public void handleCollision(Sprite other) {

		if (other instanceof AlienSprite) {
			int a = 1;
			game.removeSprite(this);
			game.removeSprite(other);
			
		}
	}
}