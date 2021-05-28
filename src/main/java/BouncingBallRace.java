import processing.core.PApplet;

import java.awt.*;

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

        sketch = new Sketch(640, 480, black);
        size(sketch.WIDTH, sketch.HEIGHT);
    }

    @Override
    public void setup() {
        setBlackBackground();
        ballOne = new Ball(red, 0, setYCoor(1), 25, 1);
        ballTwo = new Ball(green, 0, setYCoor(2), 25, 2);
        ballThree = new Ball(blue, 0, setYCoor(3), 25, 3);
        ballFour = new Ball(violet, 0, setYCoor(4), 25, 4);
    }

    @Override
    public void draw() {
        setBlackBackground();
        if (!isGameOver()) {
            setColorAndMove(ballOne);
            setColorAndMove(ballTwo);
            setColorAndMove(ballThree);
            setColorAndMove(ballFour);
        } else
            exit();
    }

    private void setBlackBackground() {
        background(sketch.BACKGROUND_COLOR.getRGB());
    }

    public void setColorAndMove(Ball ball) {
        fill(ball.color.getRed(), ball.color.getGreen(), ball.color.getBlue());
        ellipse(ball.x_position, (float) ball.y_position, ball.radius, ball.radius);
        ball.moveTheBall();
    }

    private Boolean isGameOver() {
        return ballOne.x_position > sketch.WIDTH;
    }

    private int setYCoor(int ballNo) {
        return (int) ((sketch.HEIGHT * ballNo) / 5.0);
    }

}
