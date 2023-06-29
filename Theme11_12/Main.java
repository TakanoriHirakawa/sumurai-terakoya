package review.kadai11_12;

import java.util.Scanner;

public class Main {
	private static void showFigure(Figure F) {
		F.draw();
		System.out.println("周囲の長さは、" + F.getPerimeter());
		if (F instanceof Polygon) {
			Polygon P = (Polygon) F;
			System.out.println("内角の和は、" + P.getInternalAngle());
		}
	}

	public static void main(String[] args) {
		System.out.print("図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] : >");
		int ans = new Scanner(System.in).nextInt();
		if (ans == 0) {
			System.out.println("円を描画します。");
			System.out.print("円の中心のX座標を入力してください。>");
			int x = new Scanner(System.in).nextInt();
			System.out.print("円の中心のY座標を入力してください。>");
			int y = new Scanner(System.in).nextInt();
			System.out.print("円の半径のrを入力してください。>");
			int r = new Scanner(System.in).nextInt();
			Circle c = new Circle(x, y, r);
			showFigure(c);

		} else if (ans == 2) {
			System.out.println("線を描画します。");
			System.out.print("始点のX座標(x1)を入力してください。>");
			int x1 = new Scanner(System.in).nextInt();
			System.out.print("始点のY座標(y1)を入力してください。>");
			int y1 = new Scanner(System.in).nextInt();
			System.out.print("終点のX座標(x2)を入力してください。>");
			int x2 = new Scanner(System.in).nextInt();
			System.out.print("終点のY座標(y2)を入力してください。>");
			int y2 = new Scanner(System.in).nextInt();
			Line l = new Line(x1, y1, x2, y2);
			showFigure(l);

		} else if (ans == 3) {
			System.out.println("三角形を描画します。");
			System.out.print("点１のX座標(x1)を入力してください。>");
			int x1 = new Scanner(System.in).nextInt();
			System.out.print("点１のY座標(y1)を入力してください。>");
			int y1 = new Scanner(System.in).nextInt();
			System.out.print("点２のX座標(x2)を入力してください。>");
			int x2 = new Scanner(System.in).nextInt();
			System.out.print("点２のY座標(y2)を入力してください。>");
			int y2 = new Scanner(System.in).nextInt();
			System.out.print("点３のX座標(x3)を入力してください。>");
			int x3 = new Scanner(System.in).nextInt();
			System.out.print("点３のY座標(y3)を入力してください。>");
			int y3 = new Scanner(System.in).nextInt();
			Triangle t = new Triangle(x1, y1, x2, y2, x3, y3);
			showFigure(t);

		} else if (ans == 4) {
			System.out.println("長方形を描画します。");
			System.out.print("基点のX座標を入力してください。>");
			int x = new Scanner(System.in).nextInt();
			System.out.print("基点のY座標を入力してください。>");
			int y = new Scanner(System.in).nextInt();
			System.out.print("長方形の幅を入力してください。>");
			int width = new Scanner(System.in).nextInt();
			System.out.print("長方形の高さを入力してください。>");
			int height = new Scanner(System.in).nextInt();
			Rectangle R = new Rectangle(x, y, width, height);
			showFigure(R);
		} else if (ans == 44) {
			System.out.println("正方形を描画します。");
			System.out.print("基点のX座標を入力してください。>");
			int x = new Scanner(System.in).nextInt();
			System.out.print("基点のY座標を入力してください。>");
			int y = new Scanner(System.in).nextInt();
			System.out.print("正方形の一辺の長さを入力してください。>");
			int width = new Scanner(System.in).nextInt();
			Square S = new Square(x, y, width);
			showFigure(S);

		} else {
			System.out.println("\n入力内容が不正です。プログラムを終了します。");
		}
	}
}
