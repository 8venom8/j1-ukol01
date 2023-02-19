package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();
        //TODO implementace domácího úkolu

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(230d);
        zofka.turnRight(180);
        zofka.penDown();

        nakreslitPrasatko(zofka);

        /*   osmiuhelnik(zofka);

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

      */
        zofka.penUp();
        zofka.move(200d);

        domecek(zofka);

        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(88);

        domecek(zofka);

        zofka.penUp();
        zofka.move(170d);
        zofka.turnRight(178);

        domecek(zofka);

        zofka.penUp();
        zofka.move(170d);
        zofka.turnRight(179);

        domecek(zofka);

        zofka.penUp();
        zofka.move(170d);
        zofka.turnRight(180);

        domecek(zofka);

        zofka.penUp();
        zofka.move(170d);
        zofka.turnRight(180);

        domecek(zofka);

        zofka.penUp();
        zofka.move(170d);
        zofka.turnRight(180);

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(200d);
        zofka.turnLeft(90);
        zofka.move(100d);

        domecek(zofka);

        zofka.turnRight(80);
        zofka.move(370d);
        zofka.turnRight(90);
        zofka.move(250d);

        slunicko(zofka);

        zofka.penUp();
        zofka.turnRight(43);
        zofka.move(150d);


        napisV(zofka);

        napisE(zofka);

        napisN(zofka);

        napisD(zofka);

        napisY(zofka);


    }

    private static void napisY(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(40d);
        zofka.turnLeft(60);
        zofka.move(15d);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(15d);
        zofka.turnLeft(60);
        zofka.penDown();
        zofka.move(15d);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(15d);
        zofka.turnLeft(60);
        zofka.move(40d);
        zofka.turnLeft(90);
        zofka.move(70d);
    }

    private static void napisD(Turtle zofka) {
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(50d);
        zofka.turnRight(135);
        zofka.move(22d);
        zofka.turnRight(30);
        zofka.move(22d);
        zofka.turnRight(62);
        zofka.move(22d);
        zofka.penUp();
        zofka.turnRight(220);
        zofka.move(70d);
    }

    private static void napisN(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(50d);
        zofka.turnRight(135);
        zofka.move(70d);
        zofka.turnLeft(135);
        zofka.move(50d);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50d);
        zofka.turnLeft(90);
        zofka.move(70d);
    }

    private static void napisE(Turtle zofka) {
        zofka.penDown();
        zofka.move(20d);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(20d);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(25d);
        zofka.turnRight(90);
        zofka.move(20d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(20d);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(25d);
        zofka.turnRight(90);
        zofka.move(20d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(20d);
        zofka.turnLeft(90);
        zofka.move(50d);
        zofka.turnLeft(90d);
        zofka.move(70d);
    }

    private static void napisV(Turtle zofka) {
        zofka.turnLeft(60);
        zofka.penDown();
        zofka.move(50d);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(50d);
        zofka.turnRight(115);
        zofka.penDown();
        zofka.move(50d);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50d);
        zofka.turnLeft(60);
        zofka.move(70d);
    }

    private static void domecek(Turtle zofka) {
        zofka.penDown();
        zofka.move(80d);
        zofka.turnLeft(90);
        zofka.move(130d);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(130d);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(130d);
        zofka.turnRight(40);
        zofka.penDown();
        zofka.move(65d);
        zofka.turnRight(102);
        zofka.move(65d);
        zofka.penUp();
        zofka.turnRight(40);
        zofka.move(130d);
        zofka.turnRight(90);
        zofka.move(80d);
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


    }

    private static void slunicko(Turtle zofka) {
        for (int i = 0; i < 10; i++) {
            zofka.move(13d);
            zofka.turnLeft(20);
            zofka.move(13d);
            zofka.turnLeft(20);
            zofka.move(13d);
            zofka.turnLeft(20);
            zofka.turnRight(110);
            zofka.move(30);
            zofka.penUp();
            zofka.turnRight(180);
            zofka.move(30);
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
