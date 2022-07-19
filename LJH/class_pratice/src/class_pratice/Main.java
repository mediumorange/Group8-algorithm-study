package class_pratice;


public class Main {

	public static void main(String[] args) {
		bus bus1 = new bus(40, 20, 1300, 4, 100, 23);
		bus bus2 = new bus(50,20,1,5,40,23);

		bus1.show();
		bus1.add_passenger(50);
		bus2.change_speed(30);;

	}

}
