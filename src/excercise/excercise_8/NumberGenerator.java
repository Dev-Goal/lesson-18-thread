package excercise.excercise_8;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i + ", Hashcode: " + this.hashCode());
            System.out.println("-------------------------------------------------");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted while sleeping: " +
                        "HashCode: " + this.hashCode() + ", Number: " + i);
            }
        }
    }
}
