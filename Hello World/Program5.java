import lejos.nxt.*;
import lejos.util.Delay;
/**
 * Write a description of class Program5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program5
{
    public static void main(String[] args)
    {
        LCD.drawString("Program 4", 0, 1);
        Motor.A.setSpeed(720);
        Motor.B.setSpeed(720);
        
        Motor.A.rotate(720, true);
        Motor.B.rotate(720, true);
        
        while(Motor.A.isMoving())
        {
            Delay.msDelay(200);
            LCD.drawString(Motor.A.getTachoCount()+"", 0, 2);
            LCD.drawString(Motor.B.getTachoCount()+"", 0, 3);
        }
    }
}
