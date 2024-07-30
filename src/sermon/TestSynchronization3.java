package sermon;

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class TestSynchronization3 {
    public static void main(String[] args) {
        final Table table = new Table();
        Thread thread1 = new Thread() {
            public void run() {
                table.printTable(5);
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                table.printTable(100);
            }
        };
        thread1.start();
        thread2.start();
    }
}
