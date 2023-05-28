package javaMacro.macros.skyblock;

import javaMacro.setup.MyFrame;
import javaMacro.setup.MyFrame.*;
import javaMacro.setup.MyThread;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Skyblock extends Thread {
    public int rowsPerField;
    public int fields;
    public int timeRow;
    @Override
    public void run() {
            try {
                farmCrops(rowsPerField, fields, timeRow);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
    }

    public static void farmCrops(int rowsPerField,int fields, int timeRow) throws Exception{
        System.out.println("test4");
        Thread.sleep(5000);

        Robot robot = new Robot();
        Random rand = new Random();

        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);

        Thread.sleep(2500);

        robot.keyPress(KeyEvent.VK_V);


        for (int i = 0; i <= fields; i++) {
            for (int j = 0; j <= rowsPerField; j++) {
                robot.keyPress(KeyEvent.VK_A);
                int randomNumber = rand.nextInt(801) + 200;
                Thread.sleep(timeRow + randomNumber);
                robot.keyRelease(KeyEvent.VK_A);

                robot.keyPress(KeyEvent.VK_W);
                int randomNumber3 = rand.nextInt(801) + 200;
                Thread.sleep(1500 + randomNumber3);
                robot.keyRelease(KeyEvent.VK_W);

                robot.keyPress(KeyEvent.VK_D);
                int randomNumber2 = rand.nextInt(801) + 200;
                Thread.sleep(timeRow + randomNumber2);
                robot.keyRelease(KeyEvent.VK_D);

                robot.keyPress(KeyEvent.VK_W);
                int randomNumber4 = rand.nextInt(801) + 200;
                Thread.sleep(1500 + randomNumber4);
                robot.keyRelease(KeyEvent.VK_W);
            }
            for (int k = 0; k <= rowsPerField; k++) {
                robot.keyPress(KeyEvent.VK_D);
                int randomNumber2 = rand.nextInt(801) + 200;
                Thread.sleep(timeRow + randomNumber2);
                robot.keyRelease(KeyEvent.VK_D);

                robot.keyPress(KeyEvent.VK_S);
                int randomNumber4 = rand.nextInt(801) + 200;
                Thread.sleep(1500 + randomNumber4);
                robot.keyRelease(KeyEvent.VK_S);

                robot.keyPress(KeyEvent.VK_A);
                int randomNumber = rand.nextInt(801) + 200;
                Thread.sleep(timeRow + randomNumber);
                robot.keyRelease(KeyEvent.VK_A);

                robot.keyPress(KeyEvent.VK_S);
                int randomNumber3 = rand.nextInt(801) + 200;
                Thread.sleep(1500 + randomNumber3);
                robot.keyRelease(KeyEvent.VK_S);
            }
        }
    }

    /*
    public static void farmCrops(int numberRows, int timeRow) throws InterruptedException {
        System.out.println("Rows: "+ numberRows+ "time per Row: "+timeRow);
        for (int i = 0; i < numberRows; i++) {
            System.out.println(i);
        }
    }
    public static void farmCocoaBeans(int numberRows, int timeForwards, int timeBackwards) {
        System.out.println("Cocoa Beans");
    }
    public static void farmMelonPumpkin(int numberRows, int timeForwards, int timeBackwards) {
        System.out.println("Melon/Pumpkin");
    }
     */
}
