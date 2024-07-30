package excercise.excercise_11;

public class OptimizedPrimeFactorization implements Runnable{
    private final int limit;

    public OptimizedPrimeFactorization(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int count = 0;
        int number = 2;
        while (count < limit) {
            if (isPrime(number)) {
                System.out.println("OptimizedPrimeFactorization: " + number);
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
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
