/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */


	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	                // ★ 1行ごとにArrayListに格納してください

	                Player pl = new Player();////10-4,13-9参照する可能性あり
	                ArrayList<Player> pl2 = new ArrayList<>();
	                String[] succer = line.split(",", -1);
	                
//	                for(int i = 0 ; i < succer.length ; i++) {
	                
		                pl.setPosition(succer[0]);////pl.positionではない。
		                pl.setName(succer[1]);
		                pl.setCountry(succer[2]);
		                pl.setTeam(succer[3]);
		                
		                
		                array.add(pl);
	                //}

	                //////pt11-FileReaderClassを参照する可能性あり
////Playerの型にはインスタンスしか入らない。文字列も入らない。Item型の時には、実はインスタンスが入っていた。
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }
	        
	        
		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

	    ///////////////
	        for(int b = 0;b < array.size();b++){
	            System.out.println(array.get(b).toString());////.toString()が勝手に起動しているらしい。
	        }
		///////////////

	}






}
