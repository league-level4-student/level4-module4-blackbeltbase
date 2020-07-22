package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph{

	RedMorph(int x, int y, int width, int height,boolean mover) {
		super(x, y, width, height,mover);
	}
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}

}
