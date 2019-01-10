package garage;

public abstract class  Vehicle {

    private Integer speed;

    public abstract void speedUp(Integer value);
    public abstract void breakDown(Integer value);

    public Vehicle(Integer speed){
        this.speed = speed;
    }

    public void setSpeed(Integer speed){
        this.speed = speed;
    }

    public Integer getSpeed(){
        return speed;
    }




}
