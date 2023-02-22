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

        //PIGGY
        drawPiggy(zofka);

        zofka.penUp();
        zofka.move(180d);

        //HOUSE-RIGHT
        drawHouse(zofka);

        zofka.turnRight(180);
        zofka.move(250d);
        zofka.turnRight(90);

        //HOUSE-CYCLE
        drawHouseCycle(zofka);

        //HOUSE-LEFT
        zofka.move(200d);
        zofka.turnRight(90);
        zofka.move(250d);
        zofka.turnLeft(90);

        drawHouse(zofka);

        //SUN

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(190);
        zofka.turnLeft(90);
        zofka.move(460d);

        drawSun(zofka);

        zofka.turnRight(130);
        zofka.penUp();
        zofka.move(150d);
        zofka.turnRight(90);
        zofka.move(30d);
        zofka.turnLeft(90);
        zofka.move(50d);

        //LETTER-V
        writeLetterV(zofka);

        //LETTER-E
        writeLetterE(zofka);


        //LETTER-N
        writeLetterN(zofka);


        //LETTER-D
        writeLetterD(zofka);


        //LETTER-Y
        writeLetterY(zofka);
    }

    private static void writeLetterV(Turtle zofka) {
        zofka.turnLeft(110);
        zofka.penDown();
        zofka.move(55d);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(55d);

        zofka.turnLeft(135);
        zofka.penDown();
        zofka.move(55d);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(55d);
        zofka.turnLeft(115);
        zofka.move(50d);
    }

    private static void writeLetterE(Turtle zofka) {
        zofka.penDown();
        zofka.move(30d);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30d);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(25d);
        zofka.turnRight(90);
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30d);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(25d);
        zofka.turnRight(90);
        zofka.move(30d);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30d);
        zofka.turnLeft(90);
        zofka.move(50d);
        zofka.turnLeft(90);
        zofka.move(60d);
    }

    private static void writeLetterN(Turtle zofka) {
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(50d);
        zofka.turnRight(135);
        zofka.move(70d);
        zofka.turnLeft(135);
        zofka.move(50d);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50d);
        zofka.turnLeft(90);
        zofka.move(40d);
    }

    private static void writeLetterD(Turtle zofka) {
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(50d);
        zofka.turnRight(110);
        zofka.move(30d);
        zofka.turnRight(70);
        zofka.move(30d);
        zofka.turnRight(70);
        zofka.move(30d);
        zofka.turnRight(200);
        zofka.penUp();
        zofka.move(60d);
    }

    private static void writeLetterY(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(30d);
        zofka.turnLeft(35);
        zofka.move(22d);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(22d);
        zofka.turnLeft(110);
        zofka.penDown();
        zofka.move(22d);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(22d);
        zofka.turnLeft(35);
        zofka.move(30d);
        zofka.turnLeft(90);
        zofka.move(60d);
    }

    private static void drawHouse(Turtle zofka) {

        zofka.penDown();
        zofka.move(80d);
        zofka.turnLeft(90);
        zofka.move(110d);
        zofka.turnLeft(90);
        zofka.move(80d);
        zofka.turnLeft(90d);
        zofka.move(110d);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(110d);
        zofka.turnRight(30);
        zofka.penDown();
        zofka.move(80d);
        zofka.turnRight(120);
        zofka.move(80d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(80d);
        zofka.turnLeft(120);
        zofka.move(80d);
        zofka.turnLeft(30);
        zofka.move(110d);
    }

    private static void drawHouseCycle(Turtle zofka) {

        for (int i = 0; i < 5; i++) {
            zofka.penDown();
            zofka.move(80d);
            zofka.turnLeft(90);
            zofka.move(110d);
            zofka.turnLeft(90);
            zofka.move(80d);
            zofka.turnLeft(90d);
            zofka.move(110d);
            zofka.turnRight(180);
            zofka.penUp();
            zofka.move(110d);
            zofka.turnRight(30);
            zofka.penDown();
            zofka.move(80d);
            zofka.turnRight(120);
            zofka.move(80d);
            zofka.penUp();
            zofka.turnRight(180);
            zofka.move(80d);
            zofka.turnLeft(120);
            zofka.move(80d);
            zofka.turnLeft(30);
            zofka.move(110d);

            zofka.turnRight(90);
            zofka.move(200d);
            zofka.turnRight(180);
        }

    }

    private static void drawPiggy(Turtle zofka) {
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
        zofka.turnRight(180);
        zofka.move(30d);


        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30d);
        zofka.turnRight(135);
        zofka.move(100d);
        zofka.turnRight(135);

        zofka.penDown();
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30d);

        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30d);
        zofka.turnRight(45);

        zofka.turnRight(90);
        zofka.move(120d);
        zofka.penDown();


    }

    private static void drawSun(Turtle zofka) {
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

    private static void drawCircle(Turtle zofka) {
        for (int i = 0; i < 18; i++) {
            zofka.move(18d);
            zofka.turnLeft(20);
        }

    }

    private static void drawOctagon(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.move(40d);
            zofka.turnLeft(45);
        }

    }


    public static void main(String[] args) {
        new HlavniProgram().start();



    }

}
