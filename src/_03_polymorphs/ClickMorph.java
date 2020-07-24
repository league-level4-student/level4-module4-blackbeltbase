package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class ClickMorph extends Polymorph{

	ClickMorph(int x, int y, int width, int height) {
		super(x, y, width, height, false, "");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.MAGENTA);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>=super.getX()&&e.getX()<=super.getX()+super.getWidth()&&e.getY()>=super.getY()&&e.getY()<=super.getY()+super.getHeight()) {
			JOptionPane.showMessageDialog(null, "Cool you clicked.");
		}
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
