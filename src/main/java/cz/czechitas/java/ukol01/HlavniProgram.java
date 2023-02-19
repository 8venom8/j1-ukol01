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

        zofka.turnRight(90);
        zofka.move(120d);
        zofka.penDown();

        osmiuhelnik(zofka);

        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        kolecko(zofka);

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        slunicko(zofka);
    }

    private static void slunicko(Turtle zofka) {
        for (int i = 0; i < 9; i++) {
            zofka.move(18d);
            zofka.turnLeft(20);
            zofka.move(18d);
            zofka.turnLeft(20);
            zofka.move(18d);
            zofka.turnLeft(20);
            zofka.turnRight(110);
            zofka.move(40);
            zofka.penUp();
            zofka.turnRight(180);
            zofka.move(40);
            zofka.turnRight(90);
            zofka.penDown();
        }

    }

    private static void kolecko(Turtle zofka) {
        for (int i = 0; i < 18; i++) {
            zofka.move(18d);
            zofka.turnLeft(20);
        }

    }

    private static void osmiuhelnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.move(40d);
            zofka.turnLeft(45);
        }

    }


    public static void main(String[] args) {
        new HlavniProgram().start();



    }

}
