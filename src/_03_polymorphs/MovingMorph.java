package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height,true,"");
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
	public void update() {
		super.update();
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
