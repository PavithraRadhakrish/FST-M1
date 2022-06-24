package activities;
import java.util.*;

public class Activity4 {
    public static void main (String[] args){
        int[] numbers = {15, 23, 8, 5, 10, 3, 1};
        System.out.println ("Original Array : "+ Arrays.toString(numbers));

        for (int a=1; a < numbers.length; a++){
            int b = a - 1;
            int temp = numbers[a];
            while (b >= 0 && temp < numbers[b]){
                numbers [b+1] = numbers [b];
                b--;
            }
            numbers [b+1] = temp;
        }
        System.out.println ("Sorted Array : "+ Arrays.toString(numbers));
    }
}
