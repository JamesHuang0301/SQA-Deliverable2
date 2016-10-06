package Domain;

/**
 * Created by Jameshuang on 10/5/16.
 */
public class Student extends Visitor{
    public Student(int id){
        this.id = id;
        this.type = CitySim9002.visitors[0];
        this.like.put(CitySim9002.locations[0],false);
        this.like.put(CitySim9002.locations[1],true);
        this.like.put(CitySim9002.locations[2],true);
        this.like.put(CitySim9002.locations[3],true);
        System.out.println("Visitor" + id +" is a Student.");
    }
}
