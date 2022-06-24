package activities;

public class Activity3 {
    public static void main (String[] args){
        double seconds = 1000000000;
        double earthSeconds = 31557600;
        double mercurySeconds = 0.2408467;
        double venusSeconds = 0.61519726;
        double marsSeconds = 1.8808158;
        double jupiterSeconds = 11.862615;
        double saturnSeconds = 29.447498;
        double uranusSeconds = 84.016846;
        double neptuneSeconds = 164.79132;

        double ageOnEarth = 1000000000/earthSeconds;
        System.out.println("Age on Earth : "+ageOnEarth);
        System.out.println("Age on Mercury : "+ageOnEarth/mercurySeconds);
        System.out.println("Age on Venus : "+ageOnEarth/venusSeconds);
        System.out.println("Age on Mars : "+ageOnEarth/marsSeconds);
        System.out.println("Age on Jupiter : "+ageOnEarth/jupiterSeconds);
        System.out.println("Age on Saturn : "+ageOnEarth/saturnSeconds);
        System.out.println("Age on Neptune : "+ageOnEarth/neptuneSeconds);

    }
}
