package People;

public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String flyPlane() {
        return "I believe I can fly";
    }

    public String relayMessage(){
        return "Please fasten your seatbelts";
    };
}
