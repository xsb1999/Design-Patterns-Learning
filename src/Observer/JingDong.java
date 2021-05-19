package Observer;

public class JingDong implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;


    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("京东--"+"temperature: "+temperature);
        System.out.println("京东--"+"pressure: "+pressure);
        System.out.println("京东--"+"humidity: "+humidity);
    }
}
