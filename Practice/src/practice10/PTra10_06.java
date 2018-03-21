package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car = new Car();///
		Car car1 = new Car();/////new car();ではない。
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.color = "Green";
		car2.color = "Yellow";
		car3.color = "White";
		
		
		car1.gasoline = 50;
		car2.gasoline = 50;
		car3.gasoline = 50;
		
		
		/*
		 * 佐守による補足：
		 * 
		 * car1,2,3をいかに使わないで記入できるかに挑戦したので、仕様通りには書けておりません。
		 * 
		 * 失敗していて直した点
		 * １．int distance = 0;にしてしまっていた点。
		 * ２．car1,2,3に注意しすぎていて、car.gasoline =50;だけを書き忘れていた点。
		 * 
		 * car「i」名を表現できたら楽だと思いました。
		 * 
		 */	
		
		
		for(int i = 1; i <= 3 ; i++) {
			int sum = 0;
			int distance = 300;
			int count = 0;
			car.gasoline = 50;
			
			while (true) {
				
				int run = car.run();
				count += 1;
				
				if(run == -1) {
					System.out.println("目的地に到達できませんでした");
				break;
				}
	
	
				sum += run;
				System.out.println(sum);
	
				if (sum >= distance) {
					System.out.println("car"+i+"は目的地まで" + count + "時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです");
					break;
				}
			}

		}
	}
}
