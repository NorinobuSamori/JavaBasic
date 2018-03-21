/*
 * PTra13_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_03 {

	/*
	 * ★ common.Characterクラスを継承した、common.Slimeクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（10, 5, 2）
	 */
	public class common.Character extends common.Slime{
		int HP = 10;
		int POWER = 5;
		int ENDURANCE = 2;
	}

	public static void main(String[] args) {
		// ★ common.Slimeクラスをインスンタンス化してください
		common.Slime commonslime = new common.Slime();

		// ★ common.Slimeインスタンスのnameに"スライム"を設定して下さい
		commonslime.name = "スライム";

		// ★ common.Slimeインスタンスのキャラクター情報を表示してください
		commonslime.Character();
	}
}
