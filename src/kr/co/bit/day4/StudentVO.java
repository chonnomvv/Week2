package kr.co.bit.day4;

public class StudentVO {
	private String stdNo;
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int history;
	private int total;
	private String mgrCode;
	private String accCode;
	private	String localCode;
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getMgrCode() {
		return mgrCode;
	}
	public void setMgrCode(String mgrCode) {
		this.mgrCode = mgrCode;
	}
	public String getAccCode() {
		return accCode;
	}
	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}
	public String getLocalCode() {
		return localCode;
	}
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	public StudentVO(String stdNo, String email, int kor, int eng, int math, int sci, int history, int total,
			String mgrCode, String accCode, String localCode) {
		this.stdNo = stdNo;
		this.email = email;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.history = history;
		this.total = total;
		this.mgrCode = mgrCode;
		this.accCode = accCode;
		this.localCode = localCode;
	}
	public StudentVO() {
		
	}
	@Override
	public String toString() {
		return "StudentVO [stdNo=" + stdNo + ", email=" + email + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", sci=" + sci + ", history=" + history + ", total=" + total + ", mgrCode=" + mgrCode + ", accCode="
				+ accCode + ", localCode=" + localCode + "]";
	}
	

}
