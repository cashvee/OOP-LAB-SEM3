import java.util.*;

class SharedCounter {
    private int count = 0;

    public synchronized void incrementMethod() 
    {
        System.out.println("Count (Synchronized Method): " + ++count);
    }

    public void incrementStatement() 
    {
        synchronized (this) 
        {
            System.out.println("Count (Synchronized Statement): " + ++count);
        }
    }
}

class CounterThread extends Thread {
    private final SharedCounter counter;
    private final boolean useMethod;

    CounterThread(SharedCounter counter, boolean useMethod) {
        this.counter = counter;
        this.useMethod = useMethod;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            if (useMethod)
                counter.incrementMethod();
            else
                counter.incrementStatement();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {

            }
        }
    }
}

public class syncThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose method (1=Method, 2=Statement): ");
        boolean useMethod = sc.nextInt() == 1;

        SharedCounter counter = new SharedCounter();
        CounterThread t1 = new CounterThread(counter, useMethod);
        CounterThread t2 = new CounterThread(counter, useMethod);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ignored) {
        }

        System.out.println("Main thread finished.");
        sc.close();
    }
}
