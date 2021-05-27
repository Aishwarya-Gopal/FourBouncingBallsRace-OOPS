import processing.core.PApplet;

public class BouncingBallRace extends PApplet {
    Sketch sketch;
    Ball ballOne, ballTwo;

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
    }

    @Override
    public void draw() {
        bounceAndMove(ballOne);
        bounceAndMove(ballTwo);
    }

    public void bounceAndMove(Ball ball) {
        fill(ball.RED, ball.GREEN, ball.BLUE);
        ellipse(ball.x_position, (float) ball.y_position, ball.radius, ball.radius);
        ball.moveTheBall();
    }

}
