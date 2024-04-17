package airport;
public class Airplane {

    private String model;
    private int seats;
    private double topSpeed;

    public Airplane() {
    }

    public Airplane(String model, int seats, int topSpeed) {
        this.model = model;
        this.seats = seats;
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Airplane [model=" + model + ", seats=" + seats + ", topSpeed=" + topSpeed + "]";
    }

    
}
