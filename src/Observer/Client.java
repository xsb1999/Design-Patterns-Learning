package Observer;

public class Client {
    public static void main(String[] args) {

        // 创建subject
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        Observer baidu = new Baidu();
        Observer jd = new JingDong();

        // 注册观察者
        weatherData.registerObserver(baidu);
        weatherData.registerObserver(jd);

        System.out.println("第一次：");
        weatherData.setData(30, 40, 100);
        System.out.println("==========================");
        System.out.println("变化了！");
        weatherData.setData(50, 60, 120);
    }




}
