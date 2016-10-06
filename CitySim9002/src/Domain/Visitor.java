package Domain;

/**
 * Created by Jameshuang on 10/5/16.
 */
import java.util.HashMap;

public class Visitor {
    int id;
    String type;

    HashMap<String, Boolean> like = new HashMap<String, Boolean>();

    public boolean like_dislike(String location){
        System.out.println("Visitor" + id + " is going to" + " " + location + "!");
        if (like.get(location)){
            System.out.println("Visitor" + id + " did like" + " " +location + "!");
            return true;
        }
        else {
            System.out.println("Visitor" + id + " did not like" + " " + location + ".");
            return false;
        }
    }

    public void displayleave(){
        System.out.println("Visitor" + id + " has left the city.");
    }

    public int id(){
        return this.id;
    }

    public String type(){
        return this.type;
    }
}
