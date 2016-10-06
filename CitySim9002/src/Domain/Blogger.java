package Domain;

/**
 * Created by Jameshuang on 10/5/16.
 */
public class Blogger extends Visitor{
    public Blogger(int id){
        this.id = id;
        this.type = CitySim9002.visitors[3];
        System.out.println("Visitor" + id + " is a Blooger.");
        this.like.put(CitySim9002.locations[0],false);
        this.like.put(CitySim9002.locations[1],false);
        this.like.put(CitySim9002.locations[2],false);
        this.like.put(CitySim9002.locations[3],false);
    }
}
