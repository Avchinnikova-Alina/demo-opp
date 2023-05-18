package by.itacademy.alina.avchinnikova.javabasics.oop;

public class Main {
    public static void main(String[] args) {
        Car card1 = new Car();
        card1.model = "Tesla Model S";
        card1.yearOfIssue = 2019;
        card1.generation = "1 - рестайлинг";

        Wheel wheel1 = new Wheel();
        wheel1.typeSeason = "Летние";
        wheel1.brand = "Goodyear";
        wheel1.yearOfIssue = 2017;
        wheel1.diameter = 18;
        wheel1.price = 6000;

        card1.wheel = wheel1;

        Engine engine1 = new Engine();
        engine1.type = "Электродвигатель";
        engine1.power = 449;
        engine1.torque = 660;

        card1.engine = engine1;
    }
}
