public class Car {
    // inkapsling med access modifiers
    private String manufacturer;
    private float fuel;
    // double är mer exakt än float. Så, om ett mer exakt resultat krävs, använd double.
    // en annan anledning till att använda double är att om numret inte passar intervallen
    // för en float så använd double.
    // vi bör använda float om vi har minnesbegränsningar eftersom det upptar halvt utrymme än double.

    private double speed;
    private int regNr;
    private String color;
    private boolean isRunning;


    // initilize state, constructor
    // konstruktorn används för att skapa instansen av klassen.
    // konstruktorer liknar nästan metoder förutom två saker - dess namn är detsamma som klassnamnet
    // och den har ingen returtyp.
    // vi kan skicka med argument för vilken data som krävs för att skapa instansen av klassen
    // i det här fallet behöver vi ange manufacturer, fuel, och regNr för att skapa en instans av klassen car.
    public Car(String manufacturer, float fuel, int regNr) {
        this.manufacturer = manufacturer;
        this.fuel = fuel;
        this.regNr = regNr;
        // i java är THIS en referensvariabel som refererar till det aktuella objektet, eller man kan säga
        // att THIS i Java är ett nyckelord som refererar till den aktuella objektinstansen.
        // den kan användas för att anropa aktuella klassmetoder och fält, för att skicka en instans av den aktuella klassen
        // som en parameter och för att skilja mellan de lokala variablerna och instansvariablerna.
        // att använda THIS referens kan förbättra kodens läsbarhet och minska namnkonflikter.
        speed = 0;
        isRunning = false;
    }

    // metod för att starta bilen
    // vi har inte getter och setter för isRunning för vi vill endast
    // att switchOn och switchOff metoden ska styra värdet på isRunning
    // med getter och setter skulle vi kunna manipulera isRunning utanför
    // car klassen.
    public void switchOn() {
        isRunning = true;
    }

    public void switchOff() {
        isRunning = false;
    }

    // om user kallar på accelerate så måste vi kolla så att bilen är igång
    public void accelerate() {
        // om bilen inte är igång ökar vi aldrig speed vi bara returnerar
        if(!isRunning)
            return;
        // det här blocket under körs aldrig om isRunning är = false
        speed++;
        // ökar speed
        fuel -= 0.5f;
        // när speed ökar minskar vi fuel
    }

    // vår kontrollpanel där vi kan se speed och fuel
    public void dashboard() {
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuel);
    }

    // vi har getter och setter för fuel av eventuella framtida skäl
    // vi kommer nog gå tillbaka till det här exemplet flera gånger :)
    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    // vi kommer åt speed i Program klassen
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // vi kan genom getter och setter sätta en färg på car och sedan
    // skriva ut värdet
    // settern sätter färger
    // gettern ger oss värdet
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
