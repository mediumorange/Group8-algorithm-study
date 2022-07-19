package class_pratice;

public class bus {
	private int max_passenger;
	private int current_passenger;
	private int fee;
	private int bus_number;
	private int fuel_volume;
	private int current_speed;
	private String state = "운행중";
	

	
	
	public int getMax_passenger() {
		return max_passenger;
	}

	public void setMax_passenger(int max_passenger) {
		this.max_passenger = max_passenger;
	}

	public int getCurrent_passenger() {
		return current_passenger;
	}

	public void setCurrent_passenger(int current_passenger) {
		this.current_passenger = current_passenger;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getBus_number() {
		return bus_number;
	}

	public void setBus_number(int bus_number) {
		this.bus_number = bus_number;
	}

	public int getFuel_volume() {
		return fuel_volume;
	}

	public void setFuel_volume(int fuel_volume) {
		this.fuel_volume = fuel_volume;
	}

	public int getCurrent_spped() {
		return current_speed;
	}

	public void setCurrent_spped(int current_spped) {
		this.current_speed = current_spped;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void service() {
		if (getState() == "차고지행") {
			System.out.println("현재 차고지행입니다");
		}
		
		System.out.println("현재 운행중");
	}
	
	public void change_state () {
		if (getFuel_volume() < 10 ) {
			this.state = "차고지행";
		}
		
	}
	
	public void add_passenger(int x) {
		if (x > getMax_passenger() ) {
			System.out.println("최대 수용 인원보다 승객을 추가할수없습니다");
			return;
		}
		else if (getState()== "차고지행") {
			System.out.println("현재 운행 종료상태입니다");
			return;
		}
		this.current_passenger += x ; 
	}
	
	public void change_speed(int x) {
		if(getState() == "차고지행") {
			System.out.println("현재 운행 종료 상태입니다");
			return;
		}
		this.current_speed += x;
	}
	
	public bus(int max_passenger, int current_passenger, int fee, int bus_number, int fuel_volume, int current_spped) {
		
		this.max_passenger = max_passenger;
		this.current_passenger = current_passenger;
		this.fee = 100;
		this.bus_number = bus_number;
		this.fuel_volume = fuel_volume;
		this.current_speed = 0;

	}

	public void show() {
		System.out.println("------------------------------------------");
		System.out.println("버스최대승객수: " + getMax_passenger());
		System.out.println("버스현재승객수: " + getCurrent_passenger());
		System.out.println("버스기름양: " + getFee());
		System.out.println("버스번호: " + getBus_number());
		System.out.println("버스최대기름양: " + getFuel_volume());
		System.out.println("버스현재스피드: " + getCurrent_spped());
		System.out.println("현재운행상태:" + getState());
	}

}
