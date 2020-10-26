
public class space
{   

    
    public static void main(String[]args)
    {
        SolarSystem a = new SolarSystem(1000, 1000); //creating the window for the game
        int i = 0; // variable used to dictate the speed of the individual planets
        int j = 1;

        //initialising arrays for star values
        Stars star = new Stars();
        double[] starDistance = new double[401];
        double[] starAngle = new double[401];
        double[] starDiameter = new double[401];

        //for loop to add the stars to the solar system.
        for (int y = 0; y<=400; y++)
        {
            starDistance[y] = star.getStarDistance();
            starAngle[y] = star.getStarAngle();
            starDiameter[y] = star.getStarDiameter();
        }

        //initialising arrays for asteroid values

        Asteroids asteroid = new Asteroids();
        double[] angle = new double[306];
        int[] diameter = new int[306];
        int[] distance = new int[306];
        int[] space_apart = new int[306];
        double[] shape = new double[306];

        //For loop to generate random numbers within a range to ensure each asteroid is unique(adds realism)
        
        for (int k = 0; k <= 305; k++){
            angle[k] = asteroid.getAsteroidAngle(); //unique speed
            diameter[k] = asteroid.getAsteroidDiameter(); //unique size
            distance[k]=asteroid.getAsteroidDistance(); //unqiue distance
            space_apart[k] = asteroid.getSpace_Apart(k);//unique starting point
            shape[k] = asteroid.getAsteroidShape(); //unique orbitory shape
        }


        while (j==1) //creates an infinate loop so the planets are animated
        {
            for (int y =0; y <= 400; y++)
            {
                a.drawSolarObject(starDistance[y], starAngle[y], starDiameter[y],"WHITE");
            }

            //adding planets to the solar system
            a.drawSolarObject(0.0, 0.0, 35.0, "YELLOW");
            a.drawSolarObjectAbout(36.0, ((i*3.2)), 5.0, "#402d2c", 5.0, 0.0); //MERCURY
            a.drawSolarObjectAbout(51.0, ((i*2.348)), 8.0, "#91400a", 6.0, 0.0); //VENUS
            a.drawSolarObjectAbout(68.0, (i*2.0), 10.0, "#3d88ad", 2.0, 0.0); //EARTH
            a.drawSolarObjectAbout(85.0, ((i*1.604)), 8.0, "#780901", 1.5, 0.0); //MARS
            a.drawSolarObjectAbout(154.0, ((i*0.868)), 33.0, "#5c272b", 1.0, 0.0); //JUPITER
            a.drawSolarObjectAbout(212.0, ((i*0.646)), 27.0, "#656e48", 2.0, 0.0);//SATURN
            a.drawSolarObjectAbout(327.0, ((i*0.456)), 12.0, "#90adad", 3.0, 0.0);//URANUS
            a.drawSolarObjectAbout(400.0, ((i*0.364)), 8.0, "#3f485e", 2.0, 0.0); //NEPTUNE               

            //adding the moons

            //to get the correct orbit for the moon the distance and angle of the planet the moon orbited was used
            // as the centreofrotationdistance and centreofrotationangle

            //EARTH MOON
            a.drawSolarObjectAbout(12.0, (i*4.76), 2.0, "GREY", (68.0),(i*2.0)); //EARTH MOON

            //MARS MOONS
            a.drawSolarObjectAbout(10.0, (180+(i*4.86)), 2.0, "GREY", 85.0, ((i*1.604))); //MARS MOON PHOBOSS
            a.drawSolarObjectAbout(13.0, (i*4.45), 2.0, "GREY", 85.0, ((i*1.604))); //MARS MOON DEIMOS

            //JUPITERS MOONS
            a.drawSolarObjectAbout(34.5, (i*5.05), 6.0, "GREY", 154.0, ((i*0.868))); //GANYMEDE
            a.drawSolarObjectAbout(24.0, (70+(i*5.482)), 4.0, "GREY", 154.0, ((i*0.868))); //EUROPA
            a.drawSolarObjectAbout(36.0, (320+(i*4.88)), 2.0, "GREY", 154.0, ((i*0.868))); //CALLISTO

            //SATURN MOONS
            a.drawSolarObjectAbout(31.5, (i*4.50), 4.0, "GREY", 212.0, ((i*0.646))); //TITAN

            //next add asteroid belt
            for (int x = 0; x <= 305; x++) //iterate through loop to add asteroid belt.
            {
                a.drawSolarObjectAbout(distance[x], (space_apart[x]+(i*angle[x])), diameter[x], "#8c8d8f", shape[x], 0.0);
            }

            a.finishedDrawing();

            i++;

        }   
    }       
}