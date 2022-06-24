package activities;

public class Activity6 {
    public static void main(String[] args){
        try {
            Plane plane = new Plane(10);
            plane.onboard("Radha");
            plane.onboard("Vijaya");
            plane.onboard("Pavi");
            plane.onboard("Heavenya");
            plane.onboard("Viji");
            System.out.println("Take Off Time : " + plane.takeOff());
            System.out.println("Passengers List : " + plane.getPassengers());
            Thread.sleep(5000);
            plane.land();
            System.out.println("Landed Time : " + plane.getLastTimeLanded());
            System.out.println("Passengers after the plane landed : " + plane.getPassengers());
        }
        catch (Exception e){
            System.out.println (e);
        }
    }
}
