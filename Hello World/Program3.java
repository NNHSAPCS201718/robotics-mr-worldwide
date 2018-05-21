import lejos.nxt.*;
import lejos.util.Delay;
/**
 * Run Motor 1
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program3
{
    public static void main(String args[])
    {
        LCD.drawString("Program 3", 0, 1);
        Motor.A.rotate(1440);
        LCD.drawString(Motor.A.getTachoCount()+"", 0, 2);
        Motor.A.rotateTo(0);
        LCD.drawString(Motor.A.getTachoCount()+"", 0, 3);
        Button.waitForAnyPress();
    }
}

