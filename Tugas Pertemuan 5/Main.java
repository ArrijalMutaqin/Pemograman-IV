

public class Main {
    public static void main(String args []){
        Bicycle bikeA = new Bicycle(5, 5, 5);
        System.out.println("Speed: " + bikeA.speed);
        bikeA.speedUp(2);
        System.out.println("Speed: " + bikeA.speed);
    }
}
