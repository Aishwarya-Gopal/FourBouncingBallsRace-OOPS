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
        background(sketch.BACKGROUND_COLOR);
        ballOne = new Ball(235, 52, 52, 0, sketch.HEIGHT / 5, 25, 1);
        ballTwo = new Ball(79, 255, 56, 0, (sketch.HEIGHT * 2) / 5, 25, 2);
        ballThree = new Ball(56, 232, 255, 0, (sketch.HEIGHT * 3) / 5, 25, 3);
        ballFour = new Ball(183, 89, 255, 0, (sketch.HEIGHT * 4) / 5, 25, 4);
    }

    @Override
    public void draw() {
        background(sketch.BACKGROUND_COLOR);
        if (!isGameOver()) {
            setColorAndMove(ballOne);
            setColorAndMove(ballTwo);
            setColorAndMove(ballThree);
            setColorAndMove(ballFour);
        } else
            exit();
    }

    public void setColorAndMove(Ball ball) {
        fill(ball.RED, ball.GREEN, ball.BLUE);
        ellipse(ball.x_position, (float) ball.y_position, ball.radius, ball.radius);
        ball.moveTheBall();
    }

    private Boolean isGameOver() {
        return ballOne.x_position > sketch.WIDTH;
    }
}
