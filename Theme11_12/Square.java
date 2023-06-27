package review.kadai11_12;

public class Square extends Rectangle {

	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}

	@Override
	public void draw() {
		System.out.println("[正方形を描画]点(" + this.p.getX() + "," + this.p.getY() + ")を基準として" +
				"幅・高さ" + this.width + "の正方形");
	}

}
