public class Program {
    public static void main(String[] args) {
        // vi skapar en instans av vår klass Car
        // vi måste fylla i värden för manufacturer, fuel och regNr eftersom
        // vi har sagt att vi förväntar oss det genom vår konstruktor
        Car car = new Car("Volvo", 5, 123456);

        // starta bilen först annars kan vi inte köra
        // accelerate metoden
        car.switchOn();
        //car.dashboard();
        car.accelerate();
        // verifiera värden med dashboard metoden
        car.dashboard();
        car.accelerate();
        car.accelerate();
        // exempel på att vi kan komma åt värdet för speed genom
        // getter
        // fundera på om det är så bra att vi har en setter för speed?
        // vad innebär det?
        System.out.println("Speed is: " + car.getSpeed());

        // exempel där vi ser att vi kan ange ett värde för color genom setter
        car.setColor("Red");
        // och sedan visa värdet genom getter
        System.out.println("The car is " + car.getColor());
    }
}
