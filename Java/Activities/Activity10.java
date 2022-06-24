package activities;

import java.util.HashSet;

public class Activity10 {


    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();
        hash.add("Apple");
        hash.add("Banana");
        hash.add("Carrot");
        hash.add("Dairy");
        hash.add("Egg");
        hash.add("Fig");
        System.out.println("Original HashSet : " + hash);
        System.out.println("Size of HashSet : " + hash.size());
        System.out.println("Removing Dairy from HashSet : " + hash.remove("Dairy"));
        if(hash.remove("Guava")) {
            System.out.println("Guava got removed from the HashSet");
        } else {
            System.out.println("Guava is not present in the HashSet");
        }
        System.out.println("Fig is present in HashSet : " + hash.contains("Fig"));
        System.out.println("Final updated HashSet : " + hash);
    }
}
