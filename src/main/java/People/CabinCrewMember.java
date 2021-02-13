package People;

public class CabinCrewMember extends Person{
    private Rank rank;

    public CabinCrewMember(String name, Rank rank){
        super(name);
        this.rank = rank;
    }


}
