package activities;

import java.util.HashMap;

public class Activity11 {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Yellow");
        hashMap.put(2, "Red");
        hashMap.put(3, "Blue");
        hashMap.put(4, "Green");
        hashMap.put(5, "Orange");
        System.out.println("The hash map : " + hashMap);
        System.out.println("Number of pairs or Size of the Hash Map is : " + hashMap.size());

        hashMap.remove(3);
        System.out.println("After removing one color : " + hashMap);

        if(hashMap.containsValue("Green")) {
            System.out.println("Green color is present in the Hash Map");
        } else {
            System.out.println("Green color not present in the Hash Map");
        }

        System.out.println("Number of pairs or Size of the Hash Map after removing one color is : " + hashMap.size());

    }
}
