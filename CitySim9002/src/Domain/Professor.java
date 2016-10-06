package Domain;

/**
 * Created by Jameshuang on 10/5/16.
 */
public class Professor extends Visitor{
    public Professor (int id){
        this.id = id;
        this.type = CitySim9002.visitors[2];
        System.out.println("Visitor" + id + " is a Professor.");
        this.like.put(CitySim9002.locations[0],true);
        this.like.put(CitySim9002.locations[1],true);
        this.like.put(CitySim9002.locations[2],true);
        this.like.put(CitySim9002.locations[3],true);
    }
}
