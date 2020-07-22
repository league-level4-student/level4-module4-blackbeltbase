package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean onTheMove;
    Polymorph(int x, int y,int width,int height,boolean mover){
   	 this.setX(x);
   	 this.setY(y);
   	 this.setHeight(height);
   	 this.setWidth(width);
   	 this.setOnTheMove(mover);
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
    	x++;
    	y++;
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
