package Bmw;

import java.util.Objects;
import static java.lang.Thread.sleep;

public class Taxi extends Bmw {

    private int m_iPassenger;
    private int m_iPassengerLeft;
    private int m_iFuel;
    private String m_sDestination;
    private int m_iDestinationDistance;
    private int m_iBasicDistance = 1;
    private int m_iBasicFare = 3000;
    private int m_iFare;
    private int m_iFarePay;
    private int m_iFareSum;

    public Taxi() {
        try {
            sleep(1);
        }
        catch(Exception e) {
            System.out.printf("%s", e.getMessage());
        }
        setlNum(System.currentTimeMillis());
        setiPassengerMax(4);
        m_iPassengerLeft = 4;
        m_iFuel = 100;
        m_iFare = 1000;
        setsStatus("일반");
    }


    public void setiFuel(int iFuel) {
        if ((m_iFuel + iFuel) < 10) {
            System.out.println("주유 필요");
            setsStatus("운행불가");
        }
        m_iFuel += iFuel;
    }
    public int getiFuel() {
        return m_iFuel;
    }

    public void setiPassenger(int iPassenger) {
        if (Objects.equals(getsStatus(), "일반")) {
            if (iPassenger <= getiPassengerMax()) {
                m_iPassenger = iPassenger;
                m_iPassengerLeft = getiPassengerMax() - iPassenger;
                setsStatus("운행중");
            } else {
                System.out.println("최대 승객 수 초과");
            }
        } else {
            System.out.println("탑승 불가");
        }
    }
    public int getiPassenger() {
        return m_iPassenger;
    }
    public int getiPassengerLeft() {
        return m_iPassengerLeft;
    }

    public void setsDestination(String sDestination, int iDestinationDistance) {
        m_sDestination = sDestination;
        m_iDestinationDistance = iDestinationDistance;
        m_iFarePay = m_iBasicFare + m_iFare * (iDestinationDistance - m_iBasicDistance);
        m_iFareSum += m_iFarePay;
    }
    public String getsDestination() {
        return m_sDestination;
    }
    public int getsDestinationDistance() {
        return m_iDestinationDistance;
    }

    public void setiBasicDistance(int iBasicDistance) {
        m_iBasicDistance = iBasicDistance;
    }
    public int getiBasicDistance() {
        return m_iBasicDistance;
    }

    public void setiBasicFare(int iBasicFare) {
        m_iBasicFare = iBasicFare;
    }
    public int getiBasicFare() {
        return m_iBasicFare;
    }


    public void doiFarePay() {
        if(Objects.equals(getsStatus(), "운행중")) setsStatus("일반");
        m_sDestination  = "";
        m_iDestinationDistance = 0;
        m_iFarePay = 0;
        m_iPassenger = 0;
    }
    public int getiFarePay() {
        return m_iFarePay;
    }
    public int getiFareSum() {
        return m_iFareSum;
    }
}
