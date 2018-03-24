package practice13.common;

public class Item {
	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 *////pt13-5より


			String name;
			int addtionalDamage = 0;

	public Item(String name,int additionalDamage){
		this.name = name;
		this.addtionalDamage = additionalDamage;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAddtionalDamage() {
		return addtionalDamage;
	}
	public void setAddtionalDamage(int addtionalDamage) {
		this.addtionalDamage = addtionalDamage;
	}




}
