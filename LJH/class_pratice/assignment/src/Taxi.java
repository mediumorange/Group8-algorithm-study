public class Taxi <Stirng> extends Public_transport {
    private String des;
    private int des_distance;  //목적지 까지거리
    private int base_distance = 1; //기본거리
    private int base_fee = 3000; //기본요금
    private int des_fee = 1000; // 거리당 요금

    private int Accumulated_fee;

    public int getAccumulated_fee() {
        return Accumulated_fee;
    }

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


    public void pay_fee() {               //요금지불및 승객 초기화
        System.out.println("지불할 요금은 " + add_fee() + "입니다");
        acc_fee();
        setMax_passenger(4);
        setCurrent_passenger(0);
    }

    public int add_fee() {   // 지불할 금액
        return getBase_fee()+((this.des_distance-this.base_distance)*getDes_fee());
    }

    public int acc_fee() {           //요금 누적하기
        this.Accumulated_fee += add_fee();
        return this.Accumulated_fee;
    }

    public  void change_state() {  //상태 변화시키기
        this.state = (this.state == "운행중") ? "운행불가" : "운행중";
        System.out.println("현재 상태: " + getState());
    }

    public Taxi(int num,int current_passenger,Stirng des,int des_distance) {
        super(num);

        this.current_passenger = current_passenger;
        this.max_passenger = 4;
        this.des = (String) des;
        this.des_distance = des_distance;

    }

    public void show() {
        System.out.println("탑승 승객수: "+getCurrent_passenger());
        System.out.println("잔여 승객수: "+(getMax_passenger()-getCurrent_passenger()));
        System.out.println("기본 요금 확인: "+getBase_fee());
        System.out.println("목적지: "+getDes());
        System.out.println("목적지까지 거리: "+getDes_distance());
        System.out.println("지불할 요금:"+add_fee());
        System.out.println("현재상태:"+getState());
        System.out.println("누적요금: " + getAccumulated_fee());
    }
}
