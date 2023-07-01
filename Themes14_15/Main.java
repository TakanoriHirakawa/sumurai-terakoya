package review.kadai15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BookShelf bs=new BookShelf();
		bs.list();
		System.out.println("新しい書籍を追加しますか[はい:Yes いいえ:No]");
		for (int i=0;i<bs.book.length;i++) {
			String ans = new Scanner(System.in).nextLine();
			if (ans.equalsIgnoreCase("yes") == true) {
				if (bs.setBook(i)==false) {
					i--;
				}
			} else if (ans.equalsIgnoreCase("no") == true) {
				break;
			//yes,no以外が入力された場合	
			}else {
				System.out.println("入力内容が不正です。");
				i--;
			}
			if (i<bs.book.length-1) {
				System.out.println("繰り返し、書籍を追加しますか？[はい:Yes いいえ:No]");
			}
		}
		System.out.println("プログラムを終了します。");
	}
}

