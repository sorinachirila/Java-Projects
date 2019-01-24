package watch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*System.out.println("Program started!");
        Thread.sleep(5000);//pune-l pe sleep thread-ul 1 secunda
        System.out.println("Program ended!");*/

        //initializare obiect
        StopWatchThread sw1 = new StopWatchThread("sw1");
        StopWatchThread sw2 = new StopWatchThread("sw2");
        sw1.start(); //pornim un thread
        sw2.start();
        Thread.sleep(1000);
        System.out.println("Test from main");
        //sw1.run();


    }
}
