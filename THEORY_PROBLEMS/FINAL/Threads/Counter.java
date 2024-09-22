// race conditions and critical sections

public class Counter {
    protected long count = 0;

    public synchronized void add(long value) {
        this.count += value;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        // theread A
        Thread threadA = new Thread(() -> {
            counter.add(3);
            System.out.println("Thread A finished adding " + counter.count);
        });
        // thread B
        Thread threadB = new Thread(() -> {
            counter.add(2);
            System.out.println("Thread B finished adding " + counter.count);
        });
        threadA.start();
        threadB.start();
        System.out.println("Final count " + counter.count);
    }
}
