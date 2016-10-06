package Domain;

/**
 * Created by Jameshuang on 10/5/16.
 */

import java.util.LinkedList;
import java.util.Random;

public class CitySim9002 {

    public static void main(String[] args){
        int seed = 0;
        CitySim9002 cs = new CitySim9002();

        if(cs.checkInput(args)){
            seed = Integer.parseInt(args[0]);
            System.out.println("Welcome to CitySim! Your seed is " + seed + ".");
        }
        else {
            System.out.println("Please enter one integer argument, seed");
            return;
        }
        cs.run(seed);
    }

    public boolean checkInput(String[] args){
        if(args.length == 1 && args[0].matches("[0-9]+")&& Integer.parseInt(args[0])<=9)
            return true;
        else
            return false;
    }

    public final static String[] visitors = new String[]{"Student", "Businessman", "Professor", "Blogger"};
    public final static String[] locations = new String[]{"The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown"};
    LinkedList<Visitor> visitorlist = new LinkedList<Visitor>();


    public boolean visit(Visitor visitor, String location){

        return visitor.like_dislike(location);
    }

    public Visitor generateVisitor(int type, int id){
        switch(type){
            case 0:
                return new Student(id);
            case 1:
                return new Businessman(id);
            case 2:
                return new Professor(id);
            case 3:
                return new Blogger(id);
            default:
                return null;
        }
    }

    public void run(int seed){
        Random rand = new Random(seed);
        Visitor visitor = null;

        for(int i = 1; i <= 5; i++){ //totally 5 visitors

            int typeOfVisitor = rand.nextInt(4);
            visitor = generateVisitor(typeOfVisitor, i);
            int location = rand.nextInt(4);
            while(location != 4){  //location equals to 4 means leave
                visit(visitor, locations[location]);
                location = rand.nextInt(5);
            }
            visitor.displayleave();
            System.out.println("***");
        }

    }


}