package practice13.common;

public class SuperHero extends Hero{
	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 *
	 *
	 *pt13-6より
	 */


		Item equipment;
//		public int attack() {
//			return this.power;
//		}



//setAddtionalDamage(int addtionalDamage)




		public int attack() {
			return attack() + equipment.getAddtionalDamage();
		}



		public Item getEquipment() {
			return equipment;
		}



		public void setEquipment(Item equipment) {
			this.equipment = equipment;
		}






	}


