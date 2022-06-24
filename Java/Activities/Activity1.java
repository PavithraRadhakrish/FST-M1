package activities;

public class Activity1 {

    public static void main (String[] args){
        Car carName = new Car();
        carName.make = 2021;
        carName.color = "Orange";
        carName.transmission = "Automatic";
        carName.displayCharacteristics();
        carName.accelerate();
        carName.brake();

    }
}
