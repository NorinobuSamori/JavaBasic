/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;


	////public int studentId(int studentId) {//戻り値を書こう。public class studentId()ではない。
		////this.studentId = studentId;//this.studentId = studentId;//を書き忘れていた。
		////return this.studentId;
	////}
	////ではない。

	public void setStudentId(int studentId) {//戻り値を書こう。public class studentId();ではない。
		this.studentId = studentId;//this.studentId = studentId;//を書き忘れていた。
		//intをvoidに書き換えないとエラーが起きる。
		//結局return this.studentId;を切り取った。
	}
	public int getStudentId() {//戻り値を書こう。public class studentId()ではない。
		return this.studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return this.studentName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return this.companyName;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassName() {
		return this.className;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMail() {
		return this.mail;
	}
	
	public void setPassword(String password) {//引数を空欄にするというミスをしていた。
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}




}
