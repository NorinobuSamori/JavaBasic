/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		Java2Month jRoom = (Java2Month)room;////この()roomが足りなかった。このエラーの原因は、interfaceにないはずのgetCurriculum();を呼び出そうとしていたためであった。
		String[] array = jRoom.getCurriculum();

		// 取得したカリキュラム情報を全て出力してください
		for(int i = 1 ; i < array.length ; i++ ) {
			System.out.println(array[i]);
		}
	}
}
