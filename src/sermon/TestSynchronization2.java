//package sermon;
//
//class Table {
//    synchronized void printTable(int n) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(n * i);
//            try {
//                Thread.sleep(400);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
//
//class Thread1 extends Thread {
//    Table table;
//
//    public Thread1(Table table) {
//        this.table = table;
//    }
//
//    public void run() {
//        table.printTable(5);
//    }
//}
//
//class Thread2 extends Thread {
//    Table table;
//
//    public Thread2(Table table) {
//        this.table = table;
//    }
//
//    public void run() {
//        table.printTable(100);
//    }
//}
//
//public class TestSynchronization2 {
//    public static void main(String[] args) {
//        Table table = new Table();
//        Thread1 thread1 = new Thread1(table);
//        Thread2 thread2 = new Thread2(table);
//        thread1.start();
//        thread2.start();
//    }
//}
