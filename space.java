public class space 
{
    public static void main(String[]args)
    {
        int program_running = 1;

        SolarSystem a = new SolarSystem(800, 500);
        while (program_running == 1)
        {
            a.drawSolarObject(0.0, 0.0, 100.0, "YELLOW");

            a.drawSolarObjectAbout(10.0, 20.0, 20.0, "BLUE", 0, 10);

            a.finishedDrawing();
        }
    
    }    

    
}