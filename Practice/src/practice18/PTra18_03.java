/*
 * PTra18_03.java
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

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		////////////////

		 ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	                // ★ 1行ごとにArrayListに格納してください

	                Player pl = new Player();////10-4,13-9参照する可能性あり
	                ArrayList<Player> pl2 = new ArrayList<>();
	                String[] succer = line.split(",", -1);

	                pl.setPosition(succer[0]);////pl.positionではない。
	                pl.setName(succer[1]);
	                pl.setCountry(succer[2]);

	                if(succer[3].equals("レアル・マドリード")|| succer[3].equals("バルセロナ")) {
	      			  continue;
	                }
	                pl.setTeam(succer[3]);

	                array.add(pl);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }

		///////////////

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください


//

		// ★ 削除後のArrayListの中身を全件出力してください

		  ///////
		  for(int i = 0;i < array.size();i++){
		      System.out.println(array.get(i));
		  }
		  ///////
	}
}
