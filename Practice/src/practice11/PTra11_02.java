package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		//////FileReaderClass
		Book[] booklists = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		String line = new java.util.Scanner(System.in).nextLine();

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		for(int i = 0 ; i < booklists.length ; i++ ) {
			int result = booklists[i].title.indexOf(line);
			if (result != -1) {
			    System.out.println(booklists[i].dispBookInfo());
			} else {
			    System.out.println("本が見つかりません");
			}
		}

	}
}
