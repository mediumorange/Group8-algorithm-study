import Bmw.*;

public class Test {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		System.out.printf("%d %d\n", bus1.getlNum(), bus2.getlNum());

		bus1.setiPassenger(2);
		System.out.printf("현재승객: %d, 잔여승객: %d, 요금: %d\n", bus1.getiPassenger(), bus1.getiPassengerLeft(), bus1.getiFareSum());

		bus1.setiFuel(-50);
		System.out.printf("주유량: %d\n", bus1.getiFuel());

		bus1.setsStatus("차고지행");
		bus1.setiFuel(10);
		System.out.printf("상태: %s, 주유량:%d\n", bus1.getsStatus(), bus1.getiFuel());

		bus1.setsStatus("운행");
		bus1.setiPassenger(45);
		bus1.setiPassenger(5);
		System.out.printf("현재승객: %d, 잔여승객: %d, 요금: %d\n", bus1.getiPassenger(), bus1.getiPassengerLeft(), bus1.getiFareSum());

		bus1.setiFuel(-55);
		System.out.printf("주유량: %d, 상태: %s\n", bus1.getiFuel(), bus1.getsStatus());


		Taxi taxi1 = new Taxi();
		Taxi taxi2 = new Taxi();
		System.out.printf("%d %d\n", taxi1.getlNum(), taxi2.getlNum());
		System.out.printf("주유량: %d, 상태: %s\n",taxi1.getiFuel() , taxi1.getsStatus());

		taxi1.setiPassenger(2);
		taxi1.setsDestination("서울역", 2);
		System.out.printf("탑승승객: %d 잔여승객: %d, 기본요금: %d, 목적지: %s, 목적지거리: %d, 지불요금: %d, 상태: %s\n", taxi1.getiPassenger(), taxi1.getiPassengerLeft(),
				taxi1.getiBasicFare(), taxi1.getsDestination(), taxi1.getsDestinationDistance(), taxi1.getiFarePay(), taxi1.getsStatus());

		taxi1.setiFuel(-80);
		taxi1.doiFarePay();
		System.out.printf("주유량: %d, 누적요금: %d\n",taxi1.getiFuel() , taxi1.getiFareSum());

		taxi1.setiPassenger(5);
		taxi1.setiPassenger(3);
		taxi1.setsDestination("구로디지털단지역", 12);
		System.out.printf("탑승승객: %d, 잔여승객: %d, 기본요금: %d, 목적지: %s, 목적지거리: %d, 지불요금: %d\n", taxi1.getiPassenger(), taxi1.getiPassengerLeft(),
				taxi1.getiBasicFare(), taxi1.getsDestination(), taxi1.getsDestinationDistance(), taxi1.getiFarePay());

		taxi1.setiFuel(-20);

		taxi1.doiFarePay();
		System.out.printf("주유량: %d, 상태: %s, 누적요금: %d\n", taxi1.getiFuel(), taxi1.getsStatus(), taxi1.getiFareSum());
	}
}