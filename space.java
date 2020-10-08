public class space 
{
    public static void main(String[]args)
    {
        int program_running = 1;

        SolarSystem a = new SolarSystem(800, 500);
        int i = 0;
        while (program_running == 1)
        {

                a.drawSolarObject(0.0, 0.0, 100.0, "YELLOW");
                a.drawSolarObjectAbout(150.0, i, 20.0, "BLUE", 0.0, 130.0);
                a.finishedDrawing();
                i++;
        }
    
    }    

    
}