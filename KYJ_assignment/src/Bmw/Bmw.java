package Bmw;

public class Bmw {
	private long m_lNum;
	private String m_sStatus;
	private int m_iSpeed = 0;
	private int m_iPassengerMax;


	void setlNum(long lNum) {
		m_lNum = lNum;
	}
	public long getlNum() {
		return m_lNum;
	}

	public void setsStatus(String sStatus) {
		m_sStatus = sStatus;
	}
	public String getsStatus() {
		return m_sStatus;
	}

	public void setiSpeed(int iSpeed) {
		m_iSpeed += iSpeed;
	}
	public int getiSpeed() {
		return m_iSpeed;
	}
	void setiPassengerMax(int iPassengerMax) {
		m_iPassengerMax = iPassengerMax;
	}
	public int getiPassengerMax() {
		return m_iPassengerMax;
	}
}