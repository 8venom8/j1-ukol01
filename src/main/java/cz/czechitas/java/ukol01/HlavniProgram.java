package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();


        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(180d);
        zofka.turnRight(180);
        zofka.penDown();

        nakreslitPrasatko(zofka);


        //TODO implementace domácího úkolu
    }

    private static void nakreslitPrasatko(Turtle zofka) {
        for (int i = 0; i <2; i++) {
        zofka.move(70d);
        zofka.turnRight(90);
        zofka.move(100d);
        zofka.turnRight(90);
        }

        //HLAVA
        zofka.turnLeft(45);
        zofka.move(50d);
        zofka.turnRight(90);
        zofka.move(50d);
        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(70d);
        zofka.penDown();

        //NOHY
        zofka.turnRight(45);
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(190);
        zofka.move(30d);


        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30d);
        zofka.turnRight(125);
        zofka.move(95d);
        zofka.turnRight(135);

        zofka.penDown();
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(190);
        zofka.move(30d);

        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30d);
        zofka.turnRight(35);


    }

    public static void main(String[] args) {
        new HlavniProgram().start();



    }

}
