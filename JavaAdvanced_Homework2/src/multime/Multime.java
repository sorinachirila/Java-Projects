package multime;

public class Multime {

    //define necessary fields
    private final int dim;
    private int[] date;
    private int n;

    //constructor without parameters
    public Multime(){
        this.dim = 10;
        date = new int[dim];
        this.n = 0;
    }

    //constructor with one parameter
    public Multime(int dim){
        this.dim = dim;
        date = new int[dim];
        this.n = 0;
    }

    //add a number to set
    public void adauga(int numar){

        if(this.n < this.dim){
            int i = 0;
            while(this.date[i] != numar && i < this.n){
                i++;
            }
            //make the final comparasion
            if(i == n){
                date[n] = numar;
                this.n += 1;
            }
        } else {
            System.out.println("Nu se poate adauga numarul "+ numar + "in multimea curenta!!!");
        }
    }

    //extract a number
    public void extrage(int numar){
       if(this.n < this.dim){
           for (int i = 0; i < this.n; i++) {
              if(this.date[i] == numar){
                  for (int j = i; j < this.n; j++) {
                      //fac un fel de shiftare aici
                      date[j] = date[j+1];
                      //setare zero pentru ultimul element din multimea curenta
                      date[n-1] = 0;
                      //scad numarul de elemente din multimea curenta
                      n -= 1;

                  }
              }
           }
       }

    }

    //display set
    public void afisare(){
        for (int i = 0; i < this.n; i++) {
            System.out.print(this.date[i] + " ");
        }
        System.out.println();
    }
}
