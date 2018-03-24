/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;


public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero superhero = new SuperHero();
		superhero.setName("勇者（装備あり）");

		Slime slime = new Slime();
		slime.setName("スライム");

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Item addI = new Item("こんぼう",4);


		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
//		public void setEquipment(Item equipment) {
//			this.equipment = equipment;
//		}
		superhero.setEquipment(addI);
		

//		Item(String name,int additionalDamageg){
//			this.name = name;
//			this.addtionalDamage = addtionalDamage;
//		}






		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */



		while (true) {
			boolean slose = slime.damage(superhero.attack());//今回は初期化が起きても、計算が別メソッドで更新されているようなものだったため、問題無かった。

			// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
			if (slose == true) {
				System.out.println("HeroはSlimeとの戦闘に勝利した");
				break;
			}
			boolean hlose = superhero.damage(slime.attack());

			if(hlose == true) {
				System.out.println("SlimeはHeroとの戦闘に勝利した");

				break;
			}

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		}
	}
}
