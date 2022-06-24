package activities;


public class Bicycle implements BicycleParts, BicycleOperations{

    public int gears;
    public int currentSpeed;

    public Bicycle(int gears, int currentSpeed){
        this.gears  = gears;
        this.currentSpeed = currentSpeed;
    }
    public void applyBrake(int decrement){
        System.out.println ("Speed after applying brake : "+ (this.currentSpeed = currentSpeed - decrement));
    }
    public void speedUp(int increment){
        System.out.println ("Speed after Speed Up : "+(this.currentSpeed = currentSpeed + increment));
    }
    public void bicycleDesc(){

        System.out.println ("No. of gears : "+gears);
        System.out.println ("Current Speed of the Bicycle :" +currentSpeed);
    }
}
