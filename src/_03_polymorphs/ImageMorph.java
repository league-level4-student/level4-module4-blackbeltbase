package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height, true, "");
		// TODO Auto-generated constructor stub
		if (needImage) {
			loadImage("Avatar_1.png");
		}
	}


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		if (gotImage) {
			g.drawImage(image, super.getX(), super.getY(), super.getWidth(), super.getHeight(), null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		}
	}

	void loadImage(String imageFile) {
		if (needImage) {
			try {
				image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
				gotImage = true;
			} catch (Exception e) {

			}
			needImage = false;
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
