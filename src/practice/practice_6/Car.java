package practice.practice_6;

import java.util.Random;

import static practice.practice_6.MainPractice6.DISTANCE;
import static practice.practice_6.MainPractice6.STEP;

public class Car implements Runnable{
    private String nameCar;

    public Car(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random().nextInt(20));
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + this.nameCar + ": " + log + " " + Math.min(DISTANCE, runDistance) + " KM");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.nameCar + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.nameCar + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
