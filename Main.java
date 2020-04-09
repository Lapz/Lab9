import java.util.Random;

/**
 * Lab 9: Thread Barrier
 * 
 * Main class
 * 
 *
 */
public class Main {

    private static final int threadCount = 10;
    private static final int barrierSize = 5;

    /**
     * Main program Create a barrier Create multiple instances of Process and run
     * them in threads.
     *
     * @param args
     */
    public static void main(String[] args) {

        // Create a random source for randomly setting the sleep time of the
        // process instances
        Random r = new Random();

        // Print out the number of threads
        System.out.println("Number of threads = " + threadCount);

        // Create the barrier
        Barrier barrier = new Barrier(barrierSize);

        // Create and start the process threads
        // There are threadCount threads

        for (int i = 0; i <= threadCount; i += 1) {
            (new Thread(new Process(barrier, i, r.nextInt(100)))).start();
        }
    }
}
