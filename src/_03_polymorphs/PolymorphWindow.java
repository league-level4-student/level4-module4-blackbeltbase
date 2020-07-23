package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    ArrayList <Polymorph> morphs = new ArrayList<Polymorph>();
    Random r;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.addMouseListener(this);
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 r = new Random();
   	 for(int i = 0; i<500;i++) {
   		 int random = r.nextInt(6);
   		 if(random == 0) {
   			 morphs.add(new RedMorph(r.nextInt(500),r.nextInt(500),r.nextInt(50),r.nextInt(50)));
   		 }
   		 else if(random == 1) {
   			 morphs.add(new BluePolymorph(r.nextInt(500),r.nextInt(500),r.nextInt(50),r.nextInt(50)));
   		 }
   		 else if(random == 2) {
   			 morphs.add(new CircleMorph(r.nextInt(500),r.nextInt(500),r.nextInt(50),r.nextInt(50)));
   		 }
   		 else if(random == 3) {
   			 morphs.add(new ClickMorph(r.nextInt(500),r.nextInt(500),r.nextInt(50),r.nextInt(50)));
   		 }
   		 else if(random == 4) {
   			 morphs.add(new ImageMorph(r.nextInt(500),r.nextInt(500),r.nextInt(50),r.nextInt(50)));
   		 }
   		 else {
   			 morphs.add(new MovingMorph(r.nextInt(500),r.nextInt(500),r.nextInt(50),r.nextInt(50)));
   		 }
   		 
   	 }
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
		for(Polymorph i : morphs){
			i.draw(g);
		}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for(Polymorph i : morphs){
		i.update();
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
		//mouse mover
		for (int i = 0; i < morphs.size(); i++) {
			if(morphs.get(i) instanceof MouseMorph) {
				morphs.get(i).moveMouse(e.getX(), e.getY());
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
