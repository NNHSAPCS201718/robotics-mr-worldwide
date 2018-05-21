import lejos.nxt.*;
import lejos.util.Delay;
/**
 * Run Motor 1
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program2
{
    public static void main(String args[])
    {
       LCD.drawString("Program 2", 0, 1);
       Motor.A.setSpeed(720);
       Motor.A.forward();
       LCD.clear();
       Delay.msDelay(2000);
       Motor.A.stop();
       LCD.drawString(Motor.A.getTachoCount()+"", 0, 2);
       Motor.A.backward();
       while(Motor.A.getTachoCount()>0)
       {
           LCD.drawString(Motor.A.getTachoCount()+"", 0, 3);

        }
        Motor.A.stop();
       LCD.drawString(Motor.A.getTachoCount()+"", 0, 4);
       Button.waitForAnyPress(); 
    }
    }

