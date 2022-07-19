import java.io.PrintWriter;

public class Bus extends Public_transport {

    private int fee = 1000;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public Bus(int num) {
        super(num);
        this.max_passenger = 30;
    }

}
