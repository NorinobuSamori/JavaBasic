package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User[] users = new User[5];

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		int scanner = new java.util.Scanner(System.in).nextInt();


		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start
		for(int i = 0 ; i <= users.length ; i++) {



			System.out.println("##人目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line = new java.util.Scanner(System.in).nextLine();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String[] a = line.split(",", 0);

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
			users[i].userId = Integer.parseInt(a[i]);
			users[i].userNm = a[i];
			users[i].mail = a[i];
			users[i].password = a[i];
			
		
		}
		//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		System.out.println(users[0].userId);
		System.out.println(users[1].userNm);
		System.out.println(users[2].mail);
		System.out.println(users[3].password);
	}
}
