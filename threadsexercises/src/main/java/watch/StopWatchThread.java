package watch;

public class StopWatchThread extends Thread {

    private String prefix;

    public StopWatchThread(String prefix){
        this.prefix = prefix;
    }

    @Override
    public void run(){ //metoda rulata cand dam start la thread, implicit program
        for (int i = 0; i < 10; i++) {
            System.out.println(prefix + " " + i);
        }
    }
}
