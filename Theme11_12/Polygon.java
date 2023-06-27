package review.kadai11_12;

public abstract class Polygon extends Shape {
	protected int angle;

	public int getInternalAngle() {
		return (this.angle - 2) * 180;
	}

}
