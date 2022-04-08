package Flight;

public class Plane {

    private int x, y, z, e;
    private int dir;
    private int fuel;
    //    static final String str = "СУ-29";
    private int bomb = 5;


    public Plane() {
        this(0, 0, 100, 100);
    }

    public Plane(int x, int y, int z, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.fuel = fuel;
    }

    void flyStraight(int i) {
        if (i < 0 && -i > fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
//        fuel -= Math.abs(i);
        fuel--;
        System.out.print("Вы пролетели прямо ");
    }

    void flyUp(int e, int i) {
        z += e;
        if (z <= 0) z = 0;
        flyStraight(i);
        System.out.print("и поднялись ввысь");
    }

    void flyDown(int e, int i) {
        flyUp(-e, i);
        System.out.print("Вы опустились ниже ");
    }

    void printPosition() {
        System.out.println(", сейчас находитесь на координатах: x= " + x + ", y= " + y + ", z= " + z + ". Топлива осталось= " + fuel);
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
        System.out.println("Вы повернули направо");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
        System.out.println("Вы повернули налево");
    }

    public void dropBombs() {
        bomb--;
        System.out.println("Самолет сбросил бомбы по координатам x= " + x + ", y= " + y + ", z= " + z + ". Кол-во бомб= " + bomb);
    }

    public void fillFuel() {
        fuel = 100;
        System.out.println("Вы заправились. Сейчас топлива = " + fuel);
    }
}
