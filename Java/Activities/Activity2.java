package activities;
import java.util.*;

public class Activity2 {
    public static void main(String[] args){
        int[] num = {10,77,10,54,-11,10};
        System.out.println ("Numbers in the Array: "+Arrays.toString(num));

        int searchNum = 10;
        int checkNum = 30;
        System.out.println ("The sum of all "+searchNum+ "s is exactly equal to "+ checkNum + " : " + findNumberAndAdd(searchNum, checkNum, num));

    }
    public static boolean findNumberAndAdd (int findNum, int sumNum, int numArray[]){
        int sum = 0;
        int count = 0;
        for (int a = 0; a < numArray.length; a++){
            if (numArray[a] == findNum){
                sum = sum + numArray[a];
                count = count + 1;
            }
        }

        if (count != 0){
            System.out.println ("Number of "+findNum+ "s in the Array : "+count);
            return (sum == sumNum);
        }
        else {
            System.out.println ("There is no "+findNum+ "s in the Array");
            return false;
        }
    }
}
