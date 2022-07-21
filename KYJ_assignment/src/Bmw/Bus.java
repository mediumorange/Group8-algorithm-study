package Bmw;

import java.util.Objects;

import static java.lang.Thread.sleep;

public class Bus extends Bmw {
    private int m_iPassenger = 0;
    private int m_iPassengerLeft;
    private int m_iFuel;
    private int m_iFare;
    private int m_iFareSum = 0;

    public Bus() {
        try {
            sleep(1);
        }
        catch(Exception e) {
            System.out.printf("%s", e.getMessage());
        }
        setlNum(System.currentTimeMillis());
        setiPassengerMax(30);
        m_iPassengerLeft = 30;
        m_iFuel = 100;
        m_iFare = 1000;
        setsStatus("운행");
    }


    public void setiPassenger(int iPassenger) {
        if (Objects.equals(getsStatus(), "운행")) {
            if ((m_iPassenger + iPassenger) <= getiPassengerMax()) {
                m_iPassenger += iPassenger;
                m_iFareSum += m_iFare * iPassenger;
                m_iPassengerLeft = getiPassengerMax() - m_iPassenger;
            } else {
                System.out.println("최대 승객 수 초과");
            }
        } else {
            System.out.println("운행 중인 버스만 가능");
        }
    }
    public int getiPassenger() {
        return m_iPassenger;
    }
    public int getiPassengerLeft() {
        return m_iPassengerLeft;
    }

    public void setiFuel(int iFuel) {
        if ((m_iFuel + iFuel) < 10) {
            System.out.println("주유 필요");
            setsStatus("차고지행");

        }
        m_iFuel += iFuel;
    }
    public int getiFuel() {
        return m_iFuel;
    }

    public int getiFareSum() {
        return m_iFareSum;
    }


    public void setiFare(int iFare) {
        m_iFare = iFare;
    }
}