package review.kadai17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("プログラムを起動します。");
		System.out.print("数値データを入力してください。>");
		try{
			int i = new Scanner(System.in).nextInt();
			if (i<0) {
				throw new IntOutOfRange("入力されたデータが下限を下回っています。");
			}else if(9<i) {
				throw new IntOutOfRange("入力されたデータが上限を上回っています。");
			}
			System.out.println("正しい数値データ"+ i +"が入力されました");
		}catch(InputMismatchException e){
			throw new MSG_InputMismatchException("半角数字１桁を入力してください。");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
