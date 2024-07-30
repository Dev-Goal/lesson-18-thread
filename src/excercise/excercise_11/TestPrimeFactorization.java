package excercise.excercise_11;

public class TestPrimeFactorization {
    public static void main(String[] args) {
        int limit = 50;

        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(limit);
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(limit);

        Thread lazyPrimeThread = new Thread(lazyPrimeFactorization);
        Thread optimizedPrimeThread = new Thread(optimizedPrimeFactorization);

        lazyPrimeThread.start();
//        try {
//            lazyPrimeThread.join();
//        }catch (InterruptedException e) {
//            System.out.println("Main thread interrupted");
//        }
        optimizedPrimeThread.start();
    }
}
