public class Main {

    public static void main(String[] args) {
        System.out.println("Bus simulation");
        System.out.println("------------------------------------------");
        Bus bus1 = new Bus(1);
        bus1.add_passenger(2);
        bus1.add_fuel(-50);
        System.out.println("------------------------------------------");
        bus1.change_state();
        System.out.println("------------------------------------------");
        bus1.add_fuel(10);
        bus1.change_state();
        System.out.println(bus1.getState());
        System.out.println("------------------------------------------");
        System.out.println("주유량: " + bus1.getFuel());
        System.out.println("------------------------------------------");
        bus1.add_passenger(45);
        System.out.println("------------------------------------------");
        bus1.add_passenger(5);
        System.out.println("------------------------------------------");
        bus1.add_fuel(-55);
        System.out.println("------------------------------------------");


        System.out.println("Taxi simulation");
        System.out.println("------------------------------------------");
        Taxi taxi1 = new Taxi(2, 2, "서울역", 2);
        taxi1.show();
        System.out.println("---------------------");
        taxi1.add_fuel(-80);
        System.out.println("---------------------");
        taxi1.pay_fee();


        System.out.println("---------------------");

        taxi1.setDes("구로 가산 디지털단지");
        taxi1.setCurrent_passenger(3);
        taxi1.setDes_distance(12);

        taxi1.show();
        System.out.println("---------------------");
        taxi1.add_fuel(-20);
        System.out.println("---------------------");
        taxi1.pay_fee();
        System.out.println("현재 주유량: "+taxi1.getFuel());
        System.out.println("현재 상태: "+taxi1.getState());
        System.out.println("누적요금: " + taxi1.getAccumulated_fee());



    }


}
