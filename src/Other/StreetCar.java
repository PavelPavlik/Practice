package Other;

public class StreetCar {
    String name, color;
    double acceleration;// Время разгона до 100 км/час

    public StreetCar(String name, String color, double acceleration) {
        this.name = name;
        this.color = color;
        this.acceleration = acceleration;
    }

    public String getInfo(StreetCar car) {
        return "Name: " + name + "; " + "Color: " + color + "; " + "Acceleration: " + acceleration + " sec. to 100 km/h.";
    }

    public String race(StreetCar car) {
        int distance = 1000; // Дистанция заезда в метрах
        double a1 = 100 / this.acceleration; // Ускорение в метрах в секунду в квадрате
        double a2 = 100 / car.acceleration;
        double t1 = Math.sqrt((distance * 2) / a1); // Время за которое автомобиль приедет на финиш
        double t2 = Math.sqrt((distance * 2) / a2);
        if (t1 < t2) return this.name;
        else return car.name;
    }
}
