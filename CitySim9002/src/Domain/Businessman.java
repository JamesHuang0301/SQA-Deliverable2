package Domain;

/**
 * Created by Jameshuang on 10/5/16.
 */
public class Businessman extends Visitor{
    public Businessman(int id){
        this.id = id;
        this.type = CitySim9002.visitors[1];
        System.out.println("Visitor" + id + " is a Business Man.");
        this.like.put(CitySim9002.locations[0],false);
        this.like.put(CitySim9002.locations[1],true);
        this.like.put(CitySim9002.locations[2],false);
        this.like.put(CitySim9002.locations[3],true);
    }
}
