package review.kadai11_12;

public class Line implements Figure {
	private Point p1; //始点
	private Point p2; //終点

	//コンストラクタ
	public Line() {
		this.p1=new Point(0,0);
		this.p2=new Point(0,0);
	}

	public Line(int x1, int y1, int x2, int y2) {
		this.p1=new Point(x1,y1);
		this.p2=new Point(x2,y2);
	}
	
	@Override
	public void draw() {
		System.out.println("[線を描画]始点(" + this.p1.getX() + "," + this.p1.getY() +
				")から終点(" + this.p2.getX() + "," + this.p2.getY() + ")まで");
	}

	@Override
	public double getPerimeter() {
		return Math.sqrt(Math.pow(this.p2.getX() - this.p1.getX(), 2) + Math.pow(this.p2.getY() - this.p1.getY(), 2));
	}

}
