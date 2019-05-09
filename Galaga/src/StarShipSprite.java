import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StarShipSprite extends Sprite {
	private GalagaGame game;

	public StarShipSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dx = 0;
		dy = 0;
	}

	@Override
	public void move() {
		if ((dx < 0) && (x < 10)) {
			return;
		}
		if ((dx > 0) && (x > 760)) {
			return;
		}
		super.move();
	}

	@Override
	public void handleCollision(Sprite other) {
		if (other instanceof AlienSprite) {
			game.removeSprite(this);
			int a = 1;
			game.newwin(a);
		}
	}

}