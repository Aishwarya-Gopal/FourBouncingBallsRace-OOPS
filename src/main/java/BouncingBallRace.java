import processing.core.PApplet;

public class BouncingBallRace extends PApplet {

    Sketch sketch;
    Ball ballOne, ballTwo, ballThree, ballFour;

    public static void main(String[] args) {
        PApplet.main("BouncingBallRace", args);
    }

    @Override
    public void settings() {
        super.settings();
        sketch = new Sketch(640, 480, 0);
        size(sketch.WIDTH, sketch.HEIGHT);
    }

    @Override
    public void setup() {
        setBlackBackground();
        ballOne = new Ball(235, 52, 52, 0, setYCoor(1), 25, 1);
        ballTwo = new Ball(79, 255, 56, 0, setYCoor(2), 25, 2);
        ballThree = new Ball(56, 232, 255, 0, setYCoor(3), 25, 3);
        ballFour = new Ball(183, 89, 255, 0, setYCoor(4), 25, 4);
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
        background(sketch.BACKGROUND_COLOR);
    }

    public void setColorAndMove(Ball ball) {
        fill(ball.RED, ball.GREEN, ball.BLUE);
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
