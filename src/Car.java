public class Car {
    private String manufacturer;
    private float fuel;
    private double speed;
    private int regNr;
    private String color;
    private boolean isRunning;


    // constructor
    public Car(String manufacturer, float fuel, int regNr) {
        this.manufacturer = manufacturer;
        this.fuel = fuel;
        this.regNr = regNr;
        speed = 0;
        isRunning = false;
    }

    public void switchOn() {
        isRunning = true;
    }

    public void switchOff() {
        isRunning = false;
    }

    // accelerate
    public void accelerate() {
        if(!isRunning)
            return;
        speed++;
        fuel -= 0.5f;
    }

    public void dashboard() {
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuel);
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
