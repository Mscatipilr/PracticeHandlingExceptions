import java.util.Random;

public class TemperatureSensor implements Sensor {



    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        Random random = new Random();
        int randomNumber = 31;

        if (isOn()) randomNumber = random.nextInt(61) - 30;
        if (randomNumber == 31) {
            throw new IllegalStateException ("is off");
        }
        return randomNumber;
    }
}
