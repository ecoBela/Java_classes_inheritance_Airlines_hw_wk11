package Journey;

public enum Plane {
    BOEING745(200, 14000),
    LOCKHEED_L_1011(250,17500),
    DOUGLAS_DC_10(300, 21000),
    MINI_BOEING747(5, 400);

    private final int capacity;
    private final double weight;

    Plane(int capacity, double weight){
        this.capacity = capacity;
        this.weight = weight;
    }


    public int getCapacity() {
        return this.capacity;
    }

    public double getWeight() {
        return this.weight;
    }
}
