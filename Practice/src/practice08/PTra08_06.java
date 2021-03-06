package practice08;
/*
 * PTra08_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra08_06 {
	public static void main(String[] args) {

		dispValue("こんにちは");
		dispValue(2000);
		dispValue(319.569);
		dispValue('島');

	}

	/*
	 * 以下の仕様でメソッドを作成してください
	 *
	 * 戻り値		：void
	 * メソッド名	：dispValue
	 * 引数			：String message
	 *
	 * 引数で渡された値の前後に 「 」 を付与して出力するメソッド（"「"と引数と"」"の連結）
	 */
	static void dispValue(String message) {
		System.out.println("「" +message + "」");
	}
	

	// ★ dispValueを引数intでオーバーロードしてください。処理は同じ
	static void dispValue(int year) {
		System.out.println("「" +year + "」");
	}

	// ★ dispValueを引数doubleでオーバーロードしてください。処理は同じ
	static void dispValue(double hoka1) {
		System.out.println("「" +hoka1 + "」");
	}

	// ★ dispValueを引数charでオーバーロードしてください。処理は同じ
	static void dispValue(char sima) {
		System.out.println("「" + sima + "」");
	}//
}
