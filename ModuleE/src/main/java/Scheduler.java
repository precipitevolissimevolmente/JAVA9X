public class Scheduler {
    static final int COUNT = 3;
    static final int SLEEP = 80;

    public static void main(String args[]) throws InterruptedException {
        SimpleThread threads[] = new SimpleThread[COUNT];
        for (int i = 0; i < COUNT; ++i)
            threads[i] = new SimpleThread(i);

        Thread.sleep(SLEEP);
        int index = 0;
        while (true) {
            synchronized (threads[index]) {
                threads[index].notify();
            }

            try {
                Thread.sleep(SLEEP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            index = (++index) % COUNT;
        }
    }
}
