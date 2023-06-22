package review.kadai8.themes8_2;

/*【問題文】
トランプのカードを表現するクラスCardを作成してください。
属性は種類(suit)、数(number)、表裏(visible)を持ち、表裏は表(true)、裏(false)とします。
例) "ハート", 7, true
メソッドは表裏をひっくり返す「reverse()」を持ち、引数はなしで、戻り値もありません。
Cardクラスの定義が完了したら、mainメソッドを持つMainクラスで以下の処理を実行してください。
Cardクラスからインスタンスを生成
フィールドの値に種類=スペード、数=3、表裏=表を代入
reverse()メソッドを実行
フィールド値をスラッシュ区切りで表示(スペード/3/false)
【実行結果例】
スペード/3/false
*/
public class Main {

	public static void main(String[] args) {
		// Cardクラスからインスタンスを生成
		Card c = new Card();
		c.suit = "スペード";
		c.number = 3;
		c.visible = true;
		c.reverse();
		
		System.out.println(c.suit+"/"+c.number+"/"+c.visible);

	}

}
