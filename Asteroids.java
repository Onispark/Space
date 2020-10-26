import java.util.concurrent.ThreadLocalRandom;


public class Asteroids{


    int[] asteroidDiameter = new int[306];
    double[] asteroidAngle = new double[306];
    int[] asteroidDistance = new int[306];
    int[] spaceApart = new int[306];
    double[] asteroidShape = new double[306];


    public Asteroids(){
       
    
        for (int x = 0; x <= 305; x++) //iterate through loop to add asteroid belt.
        { 
           asteroidDiameter[x] = ThreadLocalRandom.current().nextInt(1, 3 + 1);//unique size
           asteroidAngle[x] = ThreadLocalRandom.current().nextDouble(0.50, 0.85); //unique speed
           asteroidDistance[x]=ThreadLocalRandom.current().nextInt(100, 124 + 1); //unqiue distance
           spaceApart[x] = ThreadLocalRandom.current().nextInt(x*10, x*12 + 1);
           asteroidShape[x] = ThreadLocalRandom.current().nextDouble(1, 3.5); //unique orbitory shape

        }   
    }

    public Double getAsteroidAngle(int x){
        
        return asteroidAngle[x];
    }

    public int getAsteroidDistance(int x){
        
        return asteroidDistance[x];
    }

    public int getAsteroidDiameter(int x){
        
        
        return asteroidDiameter[x];

    }
    
    public int getSpaceApart(int x){
        
        return spaceApart[x];
    }
    public Double getAsteroidShape(int x){

        return asteroidShape[x];
    }
}
