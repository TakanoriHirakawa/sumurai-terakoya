package ch20.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IsDate {
	public static Date isDate(String str) {
		String[] formats = { "yy/M/d","yyyy/MM/dd", "yyyy.MM.dd", "yyyy年MM月dd日","M/d" };
		for (String format : formats) {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			try {
				return sdf.parse(str);
			}
			catch (ParseException e) {
			}
		}
		System.out.println("入力内容を日付として認識できません。");
		return null;
	}
}
