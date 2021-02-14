package People;

public class Pilot extends CabinCrewMember{

    private String licenceNumber;
    private Rank rank;

    public Pilot(String name, Rank rank, String licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }


    public String flyPlane() {
        return "I believe I can fly";
    }
}
