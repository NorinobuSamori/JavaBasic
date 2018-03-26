/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<>();
		ArrayList<Player> Agk = new ArrayList<>();////while
		ArrayList<Player> Adf = new ArrayList<>();
		ArrayList<Player> Amf = new ArrayList<>();
		ArrayList<Player> Afw = new ArrayList<>();
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
	                pl.setTeam(succer[3]);



	                if(succer[0].equals("GK")) {
	        			Agk.add(pl);
	        			Collections.shuffle(Agk);
	        		}
	        		if(succer[0].equals("DF")) {
	        			Adf.add(pl);
	        			Collections.shuffle(Adf);
	        		}
	        		if(succer[0].equals("MF")) {
	        			Amf.add(pl);
	        			Collections.shuffle(Amf);
	        		}
	        		if(succer[0].equals("FW")) {
	        			Afw.add(pl);
	        			Collections.shuffle(Afw);
	        		}
//	        		array.add(pl);

	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	        for(int b = 0 ; b < 1 ; b++){
	            System.out.println(Agk.get(b).toString());////
	        }
	        for(int b = 0 ; b < 4 ; b++){
	            System.out.println(Adf.get(b).toString());////
	        }
	        for(int b = 0 ; b < 4 ; b++){
	            System.out.println(Amf.get(b).toString());////
	        }
	        for(int b = 0 ; b < 2 ; b++){
	            System.out.println(Afw.get(b).toString());////
	        }



///////////////////
//	    Player gk = new Player();
//		Player df = new Player();
//		Player mf = new Player();
//		Player fw = new Player();
//
//		ArrayList<Player> Agk = new ArrayList<>();
//		ArrayList<Player> Adf = new ArrayList<>();
//		ArrayList<Player> Amf = new ArrayList<>();
//		ArrayList<Player> Afw = new ArrayList<>();
//
//		Collections.shuffle(Agk);
//		Collections.shuffle(Adf);
//		Collections.shuffle(Amf);
//		Collections.shuffle(Afw);
//		Collections.shuffle(array);

////////////////////
//	    RandomStringUtils.random(10,"012345abcdef");
//	    	⇒c021cc0b24
//
//	        System.out.println(RandomStringUtils.random(1,"012345abcdef"));
//	        System.out.println(RandomStringUtils.random(4,"012345abcdef"));
//	        System.out.println(RandomStringUtils.random(4,"012345abcdef"));
//	        System.out.println(RandomStringUtils.random(2,"012345abcdef"));
//
////////////////////
//		////pt9-2を参照する可能性あり
//		public class PTra09_02 {
//			public static void main(String[] args) {
//				String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};
//
//				// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
//				// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
//				String[] list = Util.shuffleArray(array);
//
//				// ★ ランダムに並び替えた後の配列を前から順に全て表示してください
//				for(int i = 0 ; i < list.length ; i++  ) {
//					System.out.println(list[i]);
//				}
//			}
//		}
////////////////////
//        for(int b = 0;b < array.size();b++){
//            System.out.println(array.get(b).toString());////
//        }
////////////////////

	}
}
