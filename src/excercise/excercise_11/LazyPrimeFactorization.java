package excercise.excercise_11;

public class LazyPrimeFactorization implements Runnable{
    private final int limit;

    public LazyPrimeFactorization(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int count = 0;
        int number = 2;
        while (count < limit) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization: " + number);
                count++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("LazyPrimeFactorization interrupted");
                }
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
