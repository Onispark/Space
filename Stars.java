import java.util.concurrent.ThreadLocalRandom;

public class Stars {
    
    public Stars(){
        // angle = starAngle*space_apart;
        // diameter = starDiameter;
        // distance = starDistance;


    }

    public Double getStarAngle(){
        double starAngle = ThreadLocalRandom.current().nextDouble(0, 1000); //unique speed
        return starAngle;
    }

    public double getStarDistance(){
        Double starDistance=ThreadLocalRandom.current().nextDouble(0, 1000); //unqiue distance
        return starDistance;
    }

    public double getStarDiameter(){
        Double starDiameter = ThreadLocalRandom.current().nextDouble(1, 3 + 1);//unique size
        return starDiameter;
    }

}


