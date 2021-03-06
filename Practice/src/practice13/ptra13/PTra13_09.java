/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */

//	public String getDepartmentNm() {
//		return departmentNm;
//	}
//
//	public void setDepartmentNm(String departmentNm) {
//		this.departmentNm = departmentNm;
//	}
//
//	public int getDepartmentCnt() {
//		return departmentCnt;
//	}
//
//	public void setDepartmentCnt(int departmentCnt) {
//		this.departmentCnt = departmentCnt;
//	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		Employee[] emplist = {e1, e2, e3};

		for (int i = 0; i < emplist.length; i++) {
			emplist[i].setUserNm(NAMEDATA[i]);
			emplist[i].setMail(MAILDATA[i]);
			emplist[i].setPassword(PASSDATA[i]);
			emplist[i].setDepartmentNm(QUATERDATA[0][i]);
			emplist[i].setDepartmentCnt(Integer.valueOf(QUATERDATA[1][i]).intValue());
		}

		for (Employee emp : emplist) {
			System.out.println("---------------------------------");
			System.out.println("ID:" + emp.getUserId());
			System.out.println("名前：" + emp.getUserNm());
			System.out.println("メールアドレス：" + emp.getMail());
			System.out.println("パスワード：" + emp.getPassword());
			System.out.println("部署：" + emp.getDepartmentNm());
			System.out.println("部署人数：" + emp.getDepartmentCnt());
		}


		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください





//
//		String departmentNm = null;
//		int departmentCnt = 0;
//
//		public String getDepartmentNm() {
//			return departmentNm;
//		}
//
//		public void setDepartmentNm(String departmentNm) {
//			this.departmentNm = departmentNm;
//		}
//
//		public int getDepartmentCnt() {
//			return departmentCnt;
//		}
//
//		public void setDepartmentCnt(int departmentCnt) {
//			this.departmentCnt = departmentCnt;
//		}

	}
}
