import java.util.concurrent.ThreadLocalRandom;

public class Stars {
    
    double[] starDistance = new double[401];
    double[] starAngle = new double[401];
    double[] starDiameter = new double[401];

    public Stars(){
        for (int y = 0; y<=400; y++)
        {
            starDistance[y] = ThreadLocalRandom.current().nextDouble(0, 1000); //unqiue distance
            starAngle[y] = ThreadLocalRandom.current().nextDouble(0, 1000); //unique speed
            starDiameter[y] = ThreadLocalRandom.current().nextDouble(1, 3 + 1);//unique size
        }



    }

    public Double getStarAngle(int x){
        return starAngle[x];
    }

    public double getStarDistance(int x){

        return starDistance[x];
    }

    public double getStarDiameter(int x){

        return starDiameter[x];
    }

}


