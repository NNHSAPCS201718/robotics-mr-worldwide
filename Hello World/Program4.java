import lejos.nxt.*;
import lejos.util.Delay;

/**
 * Write a description of class Program4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program4
{
    public static void main(String[] args)
    {
        LCD.drawString("Program 4", 0, 1);
        Motor.A.rotateTo(1440, true);
        while(Motor.A.isMoving())
        {
            Delay.msDelay(200);
            LCD.drawString(Motor.A.getTachoCount()+"", 0, 2);
            if(Button.readButtons()>0)
                Motor.A.stop();
        }

        LCD.drawString(Motor.A.getTachoCount()+"", 0, 3);
        Button.waitForAnyPress();
    }
}
