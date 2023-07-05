package review.kadai15_re;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("プログラムを起動します。");
		BookShelf bs =new BookShelf();
		System.out.println("新しい書籍を追加しますか[はい：Yes いいえ：No]");
		while(true) {
			String ans = new Scanner(System.in).nextLine();
			if(ans.equalsIgnoreCase("yes")==true) {
				//新しい書籍を追加する。
				System.out.println("新しい書籍を追加します。");
				Book book = new Book();
				System.out.println("書籍名を追加してください。>");
				book.setTitle(new Scanner(System.in).nextLine());
				System.out.print("価格を入力してください。>");
				book.setPlice(new Scanner(System.in).nextInt());
				System.out.print("著者名を入力してください。>");
				book.setAuthor( new Scanner(System.in).nextLine());
				
				//生成した本の登録可否を判断する。
				if (bs.checkList(book) ==true) {
					System.out.println("同じ書籍があるので追加されませんでした。");
				}else {
					System.out.println("登録に成功しました");
					bs.addList(book);
				}
			}else if(ans.equalsIgnoreCase("no")==true) {
				break;
			}else {
				System.out.println("入力内容が不正です。");
			}
			//本棚のリストを表示する。
			bs.list();
			System.out.println("続けて新しい書籍を登録しますか？[はい：Yes いいえ：No]");
		}
		System.out.println("プログラムを終了します。");
	}
}
