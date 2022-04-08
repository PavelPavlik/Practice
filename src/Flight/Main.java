package Flight;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();

        plane.flyStraight(50);
        plane.printPosition();
        plane.flyUp(80,90);
        plane.printPosition();
        plane.turnRight();
        plane.flyStraight(30);
        plane.printPosition();
        plane.dropBombs();
        plane.turnLeft();
        plane.flyStraight(40);
        plane.dropBombs();
        plane.flyDown(100,10);
        plane.printPosition();
        plane.flyDown(100,10);
        plane.printPosition();
        plane.fillFuel();
    }
}

//        Вы пролетели прямо и сейчас находитесь на координатах: x= 150, y= 100, z= 100. Топлива осталось= 99
//        Вы поднялись ввысь и сейчас находитесь на координатах: x= 240, y= 100, z= 180. Топлива осталось= 98
//        Вы повернули направо
//        Вы пролетели прямо и сейчас находитесь на координатах: x= 240, y= 70, z= 180. Топлива осталось= 97
//        Самолет сбросил бомбы по координатам x=240, y=70. Кол-во бомб= 4
//        Вы пролетели прямо и сейчас находитесь на координатах: x= 240, y= 30, z= 180. Топлива осталось= 96
//        Вы опустились ниже и сейчас находитесь на координатах: x= 240, y= 20, z= 80. Топлива осталось= 95
//        Нельзя заправляться в воздухе
//        Самолет приземлился)))
//        Вы заправились. Сейчас топлива= 100

