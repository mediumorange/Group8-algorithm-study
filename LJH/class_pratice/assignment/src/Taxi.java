public class Taxi <Stirng> extends Public_transport {
    private String des;
    private int des_distance;  //목적지 까지거리
    private int base_distance = 1; //기본거리
    private int base_fee = 3000; //기본요금
    private int des_fee = 1000; // 거리당 요금

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getDes_distance() {
        return des_distance;
    }

    public void setDes_distance(int des_distance) {
        this.des_distance = des_distance;
    }

    public int getBase_distance() {
        return base_distance;
    }

    public void setBase_distance(int base_distance) {
        this.base_distance = base_distance;
    }

    public int getBase_fee() {
        return base_fee;
    }

    public void setBase_fee(int base_fee) {
        this.base_fee = base_fee;
    }

    public int getDes_fee() {
        return des_fee;
    }

    public void setDes_fee(int des_fee) {
        this.des_fee = des_fee;
    }


    public void pay_fee() {
        this.max_passenger -= getCurrent_passenger();
        setCurrent_passenger(0);
    }



    public Taxi(int num,Stirng des,int des_distance) {
        super(num);
        this.max_passenger = 4;
        this.des = (String) des;
        this.des_distance = des_distance;
    }

}
