import processing.core.PApplet;

import java.awt.Color;

public class BouncingBallRace extends PApplet {

    Sketch sketch;
    Ball ballOne, ballTwo, ballThree, ballFour;
    Color black, red, green, blue, violet;

    public static void main(String[] args) {
        PApplet.main("BouncingBallRace", args);
    }

    @Override
    public void settings() {
        black = new Color(0);
        red = new Color(235, 52, 52);
        green = new Color(79, 255, 56);
        blue = new Color(56, 232, 255);
        violet = new Color(183, 89, 255);

        sketch = new Sketch(640, 480, black, this);
        size(sketch.getWIDTH(), sketch.getHEIGHT());
    }

    @Override
    public void setup() {
        sketch.setBlackBackground();
        ballOne = new Ball(red, 0, setYCoor(1), 25, 1, this);
        ballTwo = new Ball(green, 0, setYCoor(2), 25, 2, this);
        ballThree = new Ball(blue, 0, setYCoor(3), 25, 3, this);
        ballFour = new Ball(violet, 0, setYCoor(4), 25, 4, this);
    }

    @Override
    public void draw() {
        if (!isGameOver()) {
            ballOne.setColorAndMove();
            ballTwo.setColorAndMove();
            ballThree.setColorAndMove();
            ballFour.setColorAndMove();
        } else
            exit();
    }

    private Boolean isGameOver() {
        return ballOne.getX_position() > sketch.getWIDTH();
    }

    private int setYCoor(int ballNo) {
        return (int) ((sketch.getHEIGHT() * ballNo) / 5.0);
    }

}
