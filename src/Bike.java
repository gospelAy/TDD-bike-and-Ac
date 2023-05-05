public class Bike {
    private boolean isOn;
    private int accelerate = 15;

    public int getAccelerate() {
        int rate = 0;
        if (isOn){
            rate = accelerate;
        }
        return rate;
    }
    public boolean isOn(){
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

//    public void increment() {
//        accelerate++;
//    }
    public void gear1(){
        accelerate++;
    }

    public void gear2() {
        accelerate +=2;
    }

    public void gear3() {
        accelerate +=3;
    }

    public void gear4() {
        accelerate +=4;
    }
}
