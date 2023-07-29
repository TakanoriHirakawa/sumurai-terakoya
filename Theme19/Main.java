package review.kadai19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Employee> emList = new ArrayList<>();
		Employee employ1 = new Employee(1, "田中　太郎","タナカ　タロウ", 20);
		Employee employ2 = new Employee(2, "鈴木　二郎","スズキ　ジロウ", 40);
		Employee employ3 = new Employee(3, "山田　花子", "ヤマダ　ハナコ",19);
		Employee employ4 = new Employee(4, "橋本　士郎", "ハシモト　シロウ",31);
		Employee employ5 = new Employee(5, "高橋　五郎", "タカハシ　ゴロウ",54);
		Employee employ6 = new Employee(6, "吉田　歩", "ヨシダ　アユミ",22);
		Employee employ7 = new Employee(7, "和田　花", "ワダ　ハナ",30);
		Employee employ8 = new Employee(8, "山崎　蓮", "ヤマザキ　レン",28);
		Employee employ9 = new Employee(9, "三浦　一美", "ミウラ　カズミ",33);

		emList.add(employ1);
		emList.add(employ2);
		emList.add(employ3);
		emList.add(employ4);
		emList.add(employ5);
		emList.add(employ6);
		emList.add(employ7);
		emList.add(employ8);
		emList.add(employ9);

		while (true) {
			System.out.print("ソートする基準を選んでください。"
					+ "[1:社員番号（昇順）2:社員名（昇順） 3:社員番号（降順） 9:終了]>");
			try {
				int ans = new Scanner(System.in).nextInt();
				if (ans == 1) {
					System.out.println("************社員番号 昇順で並べ替え");
					Collections.sort(emList);
					System.out.println(emList);
				} else if (ans == 2) {
					System.out.println("************社員名 昇順で並べ替え");
					Collections.sort(emList, new NameComparator());
					System.out.println(emList);
				} else if (ans == 3) {
					System.out.println("************社員番号 降順で並べ替え");
					Collections.sort(emList, new DescendingCodeComparator());
					System.out.println(emList);
				} else if (ans == 9) {
					System.out.println("プログラムを終了します。");
					break;
				} else {
					System.out.println("入力が不適切です。\n適切な番号を入力してください。");
				}
				System.out.println("プログラムを終了します。");
				break;
			}catch(InputMismatchException e) {
				throw new Msg_InputMismatchException("数値を入力してください。");
			} catch (Exception e) {
				System.out.println("エラーを検知しました。内容を表示し、プログラムを終了します。");
				System.out.println("************");
				e.getStackTrace();
			}
		}
	}

}
