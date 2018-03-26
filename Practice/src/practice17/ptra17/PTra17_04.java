/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";
		long lo = 500L;
		
		dispMessageSlowly(str,lo);
		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */
		
		////9-1を参照する可能性あり
	}
	
	
	/////////
	public static void dispMessageSlowly(String message, long millisecond) {
		char[] array = message.toCharArray();
		for (int i = 0; i < message.length(); i++) {
			System.out.print(array[i]);
			try {
				Thread.sleep(millisecond);
			} catch (InterruptedException e) {
				/* エラーが発生した場合はここにくる */
			}
		}
	}
	/////////
	
	
	
//	String str = "この文字列をゆっくり表示したい";
//	long lo = 500L;
//
//	// ★ 変数strを、Util内のメソッドを用いて0.5秒間隔で表示させなさい
//	// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
//
//	Util.dispMessageSlowly(str,lo);
	
	
}
