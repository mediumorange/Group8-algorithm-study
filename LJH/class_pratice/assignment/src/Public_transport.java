public class Public_transport {
    private int num;  //번호
    private int fuel = 100; //주유량

    private int speed = 0; //속도
    private int current_passenger;
    int max_passenger; //최대 승객수

    public int getCurrent_passenger() {
        return current_passenger;
    }

    public void setCurrent_passenger(int current_passenger) {
        this.current_passenger = current_passenger;
    }


    private String state = "운행중"; //상태

    public int getNum() {
        return num;
    }

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }


    public int getMax_passenger() {
        return max_passenger;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setMax_passenger(int max_passenger) {
        this.max_passenger = max_passenger;



    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void add_passenger(int x) {

        if (getCurrent_passenger() + x > getMax_passenger()) {
            System.out.println("정원초과입니다");

        } else {
            this.current_passenger += x;
            System.out.println("탑승 승객은" + x + "입니다");
            System.out.println("잔여 승객은" + (getMax_passenger() - getCurrent_passenger()) + "입니다");
        }
    }



    public void start_service () {
        if (fuel < 10) {
            System.out.println("기름이 부족해서 운행할 수 없습니다 주유가 필요합니다" );
            change_state();
        }
    }

    public void change_speed(int x) {
        this.speed += x;
    }

    public void add_fuel(int x) {
        this.fuel += x;
        System.out.println("현재 주유량: "+ getFuel());
        if (getFuel() < 10) {
            change_state();
            System.out.println("주유필요");
        }
    }


    public  void change_state() {
        this.state = (this.state == "운행중") ? "차고지행" : "운행중";
        System.out.println("현재 상태: " + getState());
    }

    public Public_transport(int num) {
        this.num = num;
    }


}
