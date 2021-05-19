package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }



    // 注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    // 移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(temperature, pressure, humidity);
        }

    }
}
