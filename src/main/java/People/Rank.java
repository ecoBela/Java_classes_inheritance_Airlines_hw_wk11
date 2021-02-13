package People;

public enum Rank {
    CAPTAIN(1),
    FIRST_OFFICER(2),
    SECOND_OFFICER(3),
    FLIGHT_ENGINEER(4),
    IN_FLIGHT_MANAGER(5),
    FLIGHT_ATTENDANT(6);

    private final int value;

    Rank(int value){
        this.value = value;
    }


    public int getValue() {
        return value;
    }
}
