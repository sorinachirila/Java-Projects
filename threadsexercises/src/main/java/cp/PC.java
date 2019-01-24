package cp;

import java.util.LinkedList;
import java.util.List;

public class PC {

    private List<Integer> numbers = new LinkedList();
    private Integer maxListSize = 5;
    private Integer lock = 1;


    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                if (numbers.size() < maxListSize) {
                    numbers.add(value);
                    System.out.println("Produced: " + numbers);
                    value++;
                    notify();
                } else {
                    System.out.println("No more space!");
                    wait();
                }
            }

            //Thread.sleep(1000);

        }


    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (numbers.size() > 0) {
                    System.out.println("Consumed: " + numbers.remove(0));
                    notify();
                } else {
                    System.out.println("Nothing to consume!");
                    wait();
                }
            }

            //Thread.sleep(1000);
        }
    }
}