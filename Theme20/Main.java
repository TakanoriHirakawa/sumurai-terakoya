package ch20.training;

import java.text.SimpleDateFormat;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("プログラムを開始します。");
		System.out.println("誕生日を入力してください。");
		String ans = new Scanner(System.in).nextLine();

		//入力した値を日付として認識できるか判定し、実行する。
		if (!(IsDate.isDate(ans) == null)) {
			try {
				Date d = IsDate.isDate(ans);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日");
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年M月d日");
				MonthDay birthDay = MonthDay.parse(sdf.format(d), dtf);
				System.out.println(sdf.format(d) + "生まれの星座は、" +
						Constellation.getType(birthDay).getSing() + "です。");
			} catch (Exception e) {
				System.out.println("予期せぬエラーを検知");
				e.printStackTrace();
			}
		}
		System.out.println("プログラムを終了します。");
	}
}
