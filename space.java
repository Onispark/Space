
public class space
{   

    
    public static void main(String[]args)
    {
        SolarSystem a = new SolarSystem(1000, 1000); //creating the window for the game
        int i = 0; // variable used to dictate the speed of the individual planets
        int j = 1;

        //initialising arrays for star and Asteroids
        
        Stars star = new Stars();
        Asteroids asteroid = new Asteroids();
        Planets planet = new Planets();
        
        while (j==1) //creates an infinate loop so the planets are animated
        {
            for (int x =0; x <= 400; x++)
            {
                a.drawSolarObject(star.getStarDistance(x), star.getStarAngle(x), star.getStarDiameter(x),"WHITE");
            }

            //adding planets to the solar system
            a.drawSolarObject(0.0, 0.0, 35.0, "YELLOW");
            a.drawSolarObjectAbout(planet.getMercuryDistance(), planet.getMercurySpeed(i), planet.getMercurySize(), "#402d2c", planet.getMercuryCORA(), 0.0); //MERCURY
            a.drawSolarObjectAbout(planet.getVenusDistance(), planet.getVenusSpeed(i), planet.getVenusSize(), "#91400a", planet.getVenusCORA(), 0.0); //VENUS
            a.drawSolarObjectAbout(planet.getEarthDistance(),planet.getEarthSpeed(i), planet.getEarthSize(), "#3d88ad", planet.getEarthCORA(), 0.0); //EARTH
            a.drawSolarObjectAbout(planet.getMarsDistance(),planet.getMarsSpeed(i), planet.getMarsSize(), "#780901", planet.getMarsCORA(), 0.0); //MARS
            a.drawSolarObjectAbout(planet.getJupiterDistance(),planet.getJupiterSpeed(i), planet.getJupiterSize(), "#5c272b", planet.getJupiterCORA() , 0.0); //JUPITER
            a.drawSolarObjectAbout(planet.getSaturnDistance(),planet.getSaturnSpeed(i), planet.getSaturnSize(), "#656e48", planet.getSaturnCORA(), 0.0);//SATURN
            a.drawSolarObjectAbout(planet.getUranusDistance(),planet.getUranusSpeed(i), planet.getUranusSize(), "#90adad", planet.getUranusCORA(), 0.0);//URANUS
            a.drawSolarObjectAbout(planet.getNeptuneDistance(),planet.getNeptuneSpeed(i), planet.getNeptuneSize(), "#3f485e", planet.getNeptuneCORA(), 0.0); //NEPTUNE               

            //adding the moons

            //to get the correct orbit for the moon the distance and angle of the planet the moon orbited was used
            // as the centreofrotationdistance and centreofrotationangle

            //EARTH MOON
            a.drawSolarObjectAbout(12.0, (i*4.76), 2.0, "GREY", planet.getEarthDistance(),planet.getEarthSpeed(i)); //EARTH MOON

            //MARS MOONS
            a.drawSolarObjectAbout(10.0, (180+(i*4.86)), 2.0, "GREY", planet.getMarsDistance(),planet.getMarsSpeed(i)); //MARS MOON PHOBOSS
            a.drawSolarObjectAbout(13.0, (i*4.45), 2.0, "GREY", planet.getMarsDistance(),planet.getMarsSpeed(i)); //MARS MOON DEIMOS

            //JUPITERS MOONS
            a.drawSolarObjectAbout(34.5, (i*5.05), 6.0, "GREY", planet.getJupiterDistance(),planet.getJupiterSpeed(i)); //GANYMEDE
            a.drawSolarObjectAbout(24.0, (70+(i*5.482)), 4.0, "GREY", planet.getJupiterDistance(),planet.getJupiterSpeed(i)); //EUROPA
            a.drawSolarObjectAbout(36.0, (320+(i*4.88)), 2.0, "GREY", planet.getJupiterDistance(),planet.getJupiterSpeed(i)); //CALLISTO

            //SATURN MOONS
            a.drawSolarObjectAbout(31.5, (i*4.50), 4.0, "GREY", planet.getSaturnDistance(),planet.getSaturnSpeed(i)); //TITAN

            //next add asteroid belt
            for (int x = 0; x <= 305; x++) //iterate through loop to add asteroid belt.
            {
                a.drawSolarObjectAbout(asteroid.getAsteroidDistance(x), (asteroid.getSpaceApart(x)+(i*asteroid.getAsteroidAngle(x))), asteroid.getAsteroidDiameter(x), "#8c8d8f", asteroid.getAsteroidShape(x), 0.0);
            }

            a.finishedDrawing();

            i++;

        }   
    }       
}