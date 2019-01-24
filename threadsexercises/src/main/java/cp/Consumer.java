package cp;

public class Consumer extends Thread{

    private PC pc;

    public Consumer(PC pc){
        this.pc = pc;
    }

    @Override
    public void run(){
        try {
            this.pc.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
