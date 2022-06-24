package activities;

import java.util.ArrayList;


public class Activity9 {

    public static void main (String[] args){
    ArrayList<String> myList = new ArrayList<String>();
    myList.add ("Radha");
    myList.add ("Vijaya");
    myList.add ("Pavi");
    myList.add ("Heaveni");
    myList.add (2, "Viji");
    myList.add (0, "Krishnan");

    //Print all values in ArrayList
    System.out.println ("Names in ArrayList are: ");
    for(String a : myList){
        System.out.println (a);
    }

    //Print Third name in ArrayList
    System.out.println ("Third name in ArrayList: " + myList.get (2));

    //Check if name present in ArrayList
    String name = "Krishnan";
    if (myList.contains(name)){
        System.out.println ("ArrayList has the name: "+name);
    }
    else {
        System.out.println ("ArrayList does not have the name: "+name);
    }
    //Print size of the ArrayList
    System.out.println ("Size of the ArrayList: "+myList.size());

    //Remove one name from Array list
    myList.remove("Radha");
    System.out.println ("Size of the ArrayList after the removal of name: "+myList.size());

    }
}
