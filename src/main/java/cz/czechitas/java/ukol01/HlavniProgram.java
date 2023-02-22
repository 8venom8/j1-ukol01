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

    private static void writeLetterV(Turtle turtle) {
        turtle.turnLeft(110);
        turtle.penDown();
        turtle.move(55d);
        turtle.turnRight(180);
        turtle.penUp();
        turtle.move(55d);

        turtle.turnLeft(135);
        turtle.penDown();
        turtle.move(55d);
        turtle.turnLeft(180);
        turtle.penUp();
        turtle.move(55d);
        turtle.turnLeft(115);
        turtle.move(50d);
    }

    private static void writeLetterE(Turtle turtle) {
        turtle.penDown();
        turtle.move(30d);
        turtle.turnRight(180);
        turtle.penUp();
        turtle.move(30d);
        turtle.turnRight(90);
        turtle.penDown();
        turtle.move(25d);
        turtle.turnRight(90);
        turtle.move(30d);
        turtle.penUp();
        turtle.turnRight(180);
        turtle.move(30d);
        turtle.turnRight(90);
        turtle.penDown();
        turtle.move(25d);
        turtle.turnRight(90);
        turtle.move(30d);
        turtle.turnRight(180);
        turtle.penUp();
        turtle.move(30d);
        turtle.turnLeft(90);
        turtle.move(50d);
        turtle.turnLeft(90);
        turtle.move(60d);
    }

    private static void writeLetterN(Turtle turtle) {
        turtle.penDown();
        turtle.turnLeft(90);
        turtle.move(50d);
        turtle.turnRight(135);
        turtle.move(70d);
        turtle.turnLeft(135);
        turtle.move(50d);
        turtle.penUp();
        turtle.turnLeft(180);
        turtle.move(50d);
        turtle.turnLeft(90);
        turtle.move(40d);
    }

    private static void writeLetterD(Turtle turtle) {
        turtle.penDown();
        turtle.turnLeft(90);
        turtle.move(50d);
        turtle.turnRight(110);
        turtle.move(30d);
        turtle.turnRight(70);
        turtle.move(30d);
        turtle.turnRight(70);
        turtle.move(30d);
        turtle.turnRight(200);
        turtle.penUp();
        turtle.move(60d);
    }

    private static void writeLetterY(Turtle turtle) {
        turtle.turnLeft(90);
        turtle.penDown();
        turtle.move(30d);
        turtle.turnLeft(35);
        turtle.move(22d);
        turtle.turnLeft(180);
        turtle.penUp();
        turtle.move(22d);
        turtle.turnLeft(110);
        turtle.penDown();
        turtle.move(22d);
        turtle.turnLeft(180);
        turtle.penUp();
        turtle.move(22d);
        turtle.turnLeft(35);
        turtle.move(30d);
        turtle.turnLeft(90);
        turtle.move(60d);
    }

    private static void drawHouse(Turtle turtle) {

        turtle.penDown();
        turtle.move(80d);
        turtle.turnLeft(90);
        turtle.move(110d);
        turtle.turnLeft(90);
        turtle.move(80d);
        turtle.turnLeft(90d);
        turtle.move(110d);
        turtle.turnRight(180);
        turtle.penUp();
        turtle.move(110d);
        turtle.turnRight(30);
        turtle.penDown();
        turtle.move(80d);
        turtle.turnRight(120);
        turtle.move(80d);
        turtle.penUp();
        turtle.turnRight(180);
        turtle.move(80d);
        turtle.turnLeft(120);
        turtle.move(80d);
        turtle.turnLeft(30);
        turtle.move(110d);
    }

    private static void drawHouseCycle(Turtle turtle) {

        for (int i = 0; i < 5; i++) {
            turtle.penDown();
            turtle.move(80d);
            turtle.turnLeft(90);
            turtle.move(110d);
            turtle.turnLeft(90);
            turtle.move(80d);
            turtle.turnLeft(90d);
            turtle.move(110d);
            turtle.turnRight(180);
            turtle.penUp();
            turtle.move(110d);
            turtle.turnRight(30);
            turtle.penDown();
            turtle.move(80d);
            turtle.turnRight(120);
            turtle.move(80d);
            turtle.penUp();
            turtle.turnRight(180);
            turtle.move(80d);
            turtle.turnLeft(120);
            turtle.move(80d);
            turtle.turnLeft(30);
            turtle.move(110d);

            turtle.turnRight(90);
            turtle.move(200d);
            turtle.turnRight(180);
        }

    }

    private static void drawPiggy(Turtle turtle) {
        for (int i = 0; i <2; i++) {
            turtle.move(70d);
            turtle.turnRight(90);
            turtle.move(100d);
            turtle.turnRight(90);
        }

        //HLAVA
        turtle.turnLeft(45);
        turtle.move(50d);
        turtle.turnRight(90);
        turtle.move(50d);
        turtle.turnRight(135);
        turtle.penUp();
        turtle.move(70d);
        turtle.penDown();

        //NOHY
        turtle.turnRight(45);
        turtle.move(30d);
        turtle.penUp();
        turtle.turnRight(180);
        turtle.move(30d);


        turtle.turnRight(90);
        turtle.penDown();
        turtle.move(30d);
        turtle.penUp();
        turtle.turnRight(180);
        turtle.move(30d);
        turtle.turnRight(135);
        turtle.move(100d);
        turtle.turnRight(135);

        turtle.penDown();
        turtle.move(30d);
        turtle.penUp();
        turtle.turnRight(180);
        turtle.move(30d);

        turtle.turnRight(90);
        turtle.penDown();
        turtle.move(30d);
        turtle.penUp();
        turtle.turnRight(180);
        turtle.move(30d);
        turtle.turnRight(45);

        turtle.turnRight(90);
        turtle.move(120d);
        turtle.penDown();


    }

    private static void drawSun(Turtle turtle) {
        for (int i = 0; i < 10; i++) {
            turtle.move(13d);
            turtle.turnLeft(20);
            turtle.move(13d);
            turtle.turnLeft(20);
            turtle.move(13d);
            turtle.turnLeft(20);
            turtle.turnRight(110);
            turtle.move(30);
            turtle.penUp();
            turtle.turnRight(180);
            turtle.move(30);
            turtle.turnRight(90);
            turtle.penDown();
        }

    }

    private static void drawCircle(Turtle turtle) {
        for (int i = 0; i < 18; i++) {
            turtle.move(18d);
            turtle.turnLeft(20);
        }

    }

    private static void drawOctagon(Turtle turtle) {
        for (int i = 0; i < 8; i++) {
            turtle.move(40d);
            turtle.turnLeft(45);
        }

    }


    public static void main(String[] args) {
        new HlavniProgram().start();



    }

}
