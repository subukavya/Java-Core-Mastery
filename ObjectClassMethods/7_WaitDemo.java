/*
 * Topic: wait() and notify() in Java
 *
 * wait() and notify() are methods of the Object class.
 * They are used for thread communication in multithreading.
 *
 * Important:
 * - wait(), notify(), notifyAll() must be called inside synchronized block.
 * - wait() releases the lock.
 * - notify() wakes up one waiting thread.
 */

public class WaitDemo {

    public static void main(String[] args) throws Exception {

        // This object will act as a shared lock (monitor)
        Object lock = new Object();

        // Creating a new thread
        Thread t = new Thread(() -> {

            // Thread must acquire lock before calling wait()
            synchronized (lock) {

                try {
                    System.out.println("Thread started and waiting...");

                    // wait() makes current thread go to WAITING state
                    // It releases the lock and waits until notify() is called
                    lock.wait();

                    // This line executes only after notify() wakes the thread
                    System.out.println("Thread resumed after notify!");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the thread
        t.start();

        // Main thread sleeps for 1 second
        // This gives time for thread 't' to start and call wait()
        Thread.sleep(1000);

        // Main thread now acquires same lock
        synchronized (lock) {

            System.out.println("Main thread sending notify...");

            // notify() wakes up ONE thread waiting on this lock
            lock.notify();
        }
    }
}
