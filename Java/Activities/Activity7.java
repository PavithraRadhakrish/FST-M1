package activities;

public class Activity7 {
    public static void main (String[] args){
        MountainBike mountBike = new MountainBike(4, 20, 25);
        mountBike.bicycleDesc();
        mountBike.speedUp(30);
        mountBike.setHeight(26);
        mountBike.applyBrake(10);
    }
}
