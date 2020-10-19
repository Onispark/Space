public class space 
{   
    public static void main(String[]args)
    {
        SolarSystem a = new SolarSystem(1000, 1000); //creating the window for the game
        int i = 0; // variable used to dictate the speed of the individual planets

        //drawSolarObject[] stars = new drawSolarObject[14];

        while (!false) //creates an infinate loop so the planets are animated
        {
            //adding planets to the solar system
            a.drawSolarObject(0.0, 0.0, 35.0, "YELLOW");
            a.drawSolarObjectAbout(36.0, ((i*3.2)), 4.0, "#402d2c", 5.0, 0.0); //MERCURY
            a.drawSolarObjectAbout(51.0, ((i*2.348)), 8.0, "#91400a", 6.0, 0.0); //VENUS
            a.drawSolarObjectAbout(68.0, (i*2.0), 10.0, "#3d88ad", 2.0, 0.0); //EARTH
            a.drawSolarObjectAbout(85.0, ((i*1.604)), 8.0, "#780901", 1.5, 0.0); //MARS
            a.drawSolarObjectAbout(154.0, ((i*0.868)), 33.0, "#5c272b", 1.0, 0.0); //JUPITER
            a.drawSolarObjectAbout(212.0, ((i*0.646)), 27.0, "#656e48", 2.0, 0.0);//SATURN
            a.drawSolarObjectAbout(327.0, ((i*0.456)), 12.0, "#90adad", 3.0, 0.0);//URANUS
            a.drawSolarObjectAbout(400.0, ((i*0.364)), 8.0, "#3f485e", 4.0, 0.0); //NEPTUNE

            //adding the moons
            a.drawSolarObjectAbout(12.0, (i*4.76), 2.0, "GREY", (68.0),(i*2.0)); //EARTH MOON
            a.drawSolarObjectAbout(10.0, (180+(i*4.86)), 2.0, "GREY", 85.0, ((i*1.604))); //MARS MOON PHOBOSS
            a.drawSolarObjectAbout(13.0, (i*4.45), 2.0, "GREY", 85.0, ((i*1.604))); //MARS MOON DEIMOS

            //JUPITERS MOONS
            a.drawSolarObjectAbout(34.5, (i*5.05), 6.0, "GREY", 154.0, ((i*0.868))); //GANYMEDE
            a.drawSolarObjectAbout(24.0, (70+(i*5.482)), 4.0, "GREY", 154.0, ((i*0.868))); //EUROPA
            a.drawSolarObjectAbout(36.0, (320+(i*4.88)), 2.0, "GREY", 154.0, ((i*0.868))); //CALLISTO

            //SATURN MOONS
            a.drawSolarObjectAbout(31.5, (i*4.50), 4.0, "GREY", 212.0, ((i*0.646))); //TITAN

            a.finishedDrawing();

            i++;
        }   
    }       
}