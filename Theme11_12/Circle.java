package review.kadai11_12;

public class Circle extends Shape implements Figure {
	private Point center;
	private int radius;
	
	public Circle() {
		this.center.setX(0);
		this.center.setY(0);
		this.radius=0;
	}
	
	public Circle(int x, int y, int r) {
		this.center= new Point(x,y); 
		this.radius=r;
	}
	
	@Override
	public void draw() {
		System.out.println("[円を描画]中心点(" + this.center.getX() + "," + this.center.getY() + ")から半径" + this.radius);
	}

	@Override
	public double getPerimeter() {
		return this.radius*2*Math.PI;
	}
}
