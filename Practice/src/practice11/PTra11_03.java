package practice11;
/*
 * PTra11_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_03 {

	/*
	 * ★ PTra11_03クラスに、クラスフィールドでint型のnumberを定義してください
	 */

	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */


	int number;

	PTra11_03(){///よく見ると();がついている。
		number += 1;
	}

	public static void main(String[] args) {

		// ★ sumメソッドを呼び出してください
		PTra11_03 tra11_03 = new PTra11_03();/////これでコンストラクタを使用可能になりました。
		tra11_03.sum(5,7);
	}

	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));

		System.out.println("クラスフィールドnumber：" + this.number/* + ★ クラスフィールドnumberの出力をしてください */);
	}
}
