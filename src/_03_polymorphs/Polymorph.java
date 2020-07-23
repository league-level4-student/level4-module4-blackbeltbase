package _03_polymorphs;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.util.Random;

public abstract class Polymorph implements MouseListener{
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean onTheMove;
    private String shape;
    private boolean mouse = false;
    Random r = new Random();
    Polymorph(int x, int y,int width,int height,boolean mover,String shape){
   	 this.setX(x);
   	 this.setY(y);
   	 this.setHeight(height);
   	 this.setWidth(width);
   	 this.setOnTheMove(mover);
   	 this.shape = shape;
    }
    
    public void setOnTheMove(boolean mover) {
		// TODO Auto-generated method stub
		this.onTheMove = mover;
	}
    public boolean getOnTheMove() {
    	return onTheMove;
    }

	public void update(){
		if(onTheMove) {
   	 move();
		}
    }
    public void move() {
    	if(shape.equals("")) {
    		int i =r.nextInt(3);
    		if(i == 0) {
    	if(x>900) {
    	x--;
    	}
    	else {
    		x++;
    	}
    		}else if(i==1){
    			x++;
    			y--;
    		}
    		else if(i == 2) {
    			x--;
    			y++;
    		}
    		else {
    			x--;
    			y--;
    		}
    	}
    	else if(shape.equals("c")) {
    		x += Math.sin(360);
    		y+=1;
    		x+= Math.cos(360);
    		x+=1;
    		y+= Math.sin(360);
    		x+=1;
    		y+= Math.cos(360);
    	}
    	else if(shape.equals("mouse")) {
    		if(x<900&&x>0&&y<600&&y>0) {
    			mouse = true;
    		}
    	}
    }
    public void moveMouse(int x,int y) {
    	if(mouse) {
    		this.x = x;
    	this.y = y;
    	}
    }
    public abstract void draw(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void setWidth(int w) {
		this.width = w;
	}
	public void setHeight(int h) {
		this.height = h;
	}
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}
}
