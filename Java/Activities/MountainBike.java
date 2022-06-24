package activities;

public class MountainBike extends Bicycle
{
    int seatHeight;
    public MountainBike(int gears, int currentSpeed, int seatHeight){
        super(gears,currentSpeed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int newVal){
        System.out.println ("New Height of the Bike : "+(this.seatHeight = newVal));
    }

    public void bicycleDesc(){
        super.bicycleDesc();
        System.out.println("Seat Height of the Mountain Bike is : " +seatHeight);
    }
}
