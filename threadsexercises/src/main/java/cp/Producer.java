package cp;

public class Producer extends Thread {

    private PC pc;

    public Producer(PC pc){
        this.pc = pc;
    }

    @Override
    public void run(){
        try {
            this.pc.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
