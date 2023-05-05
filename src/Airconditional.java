public class Airconditional {

    private boolean isOn;
    private int temperature = 16;

    public boolean isOn(){
        return isOn;
    }

    public int getTemperature() {
        int tem = 0;
        if (isOn){
            tem = temperature;
        }
        return tem;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseTemperature() {
        temperature++;
        if (temperature >= 30) temperature = 30;
    }

    public void decreaseTemperature() {
        temperature--;
        if (temperature <= 16) temperature = 16;
    }
}
