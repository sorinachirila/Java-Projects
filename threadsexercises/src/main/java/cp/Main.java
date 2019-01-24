package cp;

public class Main {
    public static void main(String[] args) {
        PC pc  = new PC();
        Thread producer = new Producer(pc);
        producer.start();

        Thread consumer = new Consumer(pc);
        consumer.start();

       /* Produced: [0]
        Consumed: 0
        Produced: [1]
        Consumed: 1
        Produced: [2]
        Consumed: 2
        Nothing to consume!
        Produced: [3]
        Produced: [3, 4]
        Produced: [3, 4, 5]
        Produced: [3, 4, 5, 6]
        Produced: [3, 4, 5, 6, 7]
        No more space!*/
    }
}
