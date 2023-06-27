package review.kadai11_12;

public class Triangle extends Polygon {
	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		this.angle = 3;
	}

	public void getp1() {
		System.out.println("点(" + this.p1.getX() + "," + this.p1.getY() + ")");
	}

	@Override
	public void draw() {
		System.out.println("[三角形を描画]点１(" + this.p1.getX() + "," + this.p1.getY() +
				")から点2(" + this.p2.getX() + "," + this.p2.getY() +
				")から点3(" + this.p3.getX() + "," + this.p3.getY() + ")の三角形");
	}

	@Override
	public double getPerimeter() {
		Line l1 = new Line(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
		Line l2 = new Line(this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3.getY());
		Line l3 = new Line(this.p3.getX(), this.p3.getY(), this.p1.getX(), this.p1.getY());

		return l1.getPerimeter() + l2.getPerimeter() + l3.getPerimeter();

	}

}
