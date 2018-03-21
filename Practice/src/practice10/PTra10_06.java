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
		Car car1 = new Car();/////car();ではない。
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.color = "Green";
		car2.color = "Yellow";
		car1.color = "White";
		
		car1.gasoline = 50;
		car2.gasoline = 50;
		car3.gasoline = 50;
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
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
				System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです");
				break;
			}

		}
	}
}
