package People;

public class Passenger extends Person{
    private int NumberOfBags;

    public Passenger(String name, int NumberOfBags){
        super(name);
        this.NumberOfBags = NumberOfBags;

    }

    public int getNumberOfBags() {
        return this.NumberOfBags;
    }
}
