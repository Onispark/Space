public class space 
{   
    public static void main(String[]args)
    {
        SolarSystem a = new SolarSystem(700, 700); //creating the window for the game
        int i = 0; // variable used to dictate the speed of the individual planets

        //drawSolarObject[] stars = new drawSolarObject[14];

        while (!false) //creates an infinate loop so the planets are animated
        {
            //adding planets to the solar system
            a.drawSolarObject(0.0, 0.0, 45.0, "YELLOW");
            a.drawSolarObjectAbout(50.0, (95+(i*2.8)), 8.0, "#402d2c", 5.0, 0.0); //MERCURY
            a.drawSolarObjectAbout(90.0, (190+(i*2.52)), 16.0, "#91400a", 6.0, 0.0); //VENUS
            a.drawSolarObjectAbout(130.0, (i*2.05), 20.0, "#3d88ad", 2.0, 0.0); //EARTH
            a.drawSolarObjectAbout(140.0, (300+(i*1.93)), 26.0, "#780901", 1.5, 0.0); //MARS
            a.drawSolarObjectAbout(190.0, (165+(i*1.30)), 40.0, "#5c272b", 1.0, 0.0); //JUPITER
            a.drawSolarObjectAbout(230.0, (25+(i*1.10)+25), 35.0, "#656e48", 2.0, 0.0);//SATURN
            a.drawSolarObjectAbout(250.0, (355+(i*1.0)), 20.0, "#90adad", 3.0, 0.0);//URANUS
            a.drawSolarObjectAbout(265.0, (i+193), 16.0, "#3f485e", 4.0, 0.0); //NEPTUNE
            a.finishedDrawing();
            i++;
        }   
    }       
}