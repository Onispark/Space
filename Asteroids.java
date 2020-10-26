import java.util.concurrent.ThreadLocalRandom;

public class Asteroids{


    public Asteroids(){
        // angle = asteroidAngle*space_apart;
        // diameter = asteroidDiameter;
        // distance = asteroidDistance;
        // col = "GREY";
        // centreOfRotationDistance = 0;
        // centreOfRotationAngle = asteroidShape;

    }

    public Double getAsteroidAngle(){
        double asteroidAngle = ThreadLocalRandom.current().nextDouble(0.50, 0.85); //unique speed
        return asteroidAngle;
    }

    public int getAsteroidDistance(){
        int asteroidDistance=ThreadLocalRandom.current().nextInt(100, 124 + 1); //unqiue distance
        return asteroidDistance;
    }

    public int getAsteroidDiameter(){
        int asteroidDiameter = ThreadLocalRandom.current().nextInt(1, 3 + 1);//unique size
        return asteroidDiameter;
    }
    
    public int getSpace_Apart(int k){
        int space_apart = ThreadLocalRandom.current().nextInt(k*10, k*12 + 1);
        return space_apart;
    }
    public Double getAsteroidShape(){
        double asteroidShape = ThreadLocalRandom.current().nextDouble(1, 3.5); //unique orbitory shape
        return asteroidShape;
    }
}
