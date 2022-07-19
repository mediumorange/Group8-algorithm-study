public class Main {

    public static void main(String[] args) {
        Bus bus1 = new Bus(1);

        bus1.add_passenger(2);
        bus1.add_fuel(-50);
        bus1.change_state();
        System.out.println("------------------------------------------");
        bus1.add_fuel(10);
        bus1.change_state();
        System.out.println(bus1.getState());
        System.out.println("------------------------------------------");
        System.out.println("주유량: "+bus1.getFuel());
        System.out.println("------------------------------------------");
        bus1.add_passenger(45);
        System.out.println("------------------------------------------");
        bus1.add_passenger(5);
        System.out.println("------------------------------------------");
        bus1.add_fuel(-55);
        System.out.println("버스상태: "+bus1.getState());










    }


}
