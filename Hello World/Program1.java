import lejos.nxt.*;
/**
 * Run Motor 1
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program1
{
    public static void main(String args[])
    {
       LCD.drawString("Program 1", 0, 0);
       Button.waitForAnyPress();
       Motor.A.forward();
       LCD.drawString("FORWARD", 0, 1);
       Button.waitForAnyPress();
       Motor.A.backward();
       LCD.drawString("BACKWARD", 0, 2);
       Button.waitForAnyPress();
       Motor.A.stop();
       
    }
    }

