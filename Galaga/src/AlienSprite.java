import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AlienSprite extends Sprite {
	private GalagaGame game;

	public AlienSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dx = -10;
	}

	@Override
	public void move() {
		if (((dx < 0) && (x < 10)) || ((dx > 0) && (x > 800))) {
			dx = -dx;
			y += 10;
			if (y > 600) {
				int a = 1;
				game.newwin(a);
			}
		}
		super.move();
	}

}