import static processing.core.PApplet.sin;
import static processing.core.PConstants.TWO_PI;

public class Ball {

    public int RED;
    public int GREEN;
    public int BLUE;
    public int x_position;
    public double y_position;
    public int radius;
    public int velocity;

    private double amplitude;
    private final double Y_POSITION;

    public Ball(int RED, int GREEN, int BLUE, int x_position, int y_position, int radius, int velocity) {
        this.RED = RED;
        this.GREEN = GREEN;
        this.BLUE = BLUE;
        this.x_position = x_position;
        this.y_position = 0;
        this.radius = radius;
        this.velocity = velocity;
        this.Y_POSITION = y_position;
        amplitude = 0.1F;
    }

    public void moveTheBall() {
        this.x_position += this.velocity;
        this.y_position = this.Y_POSITION + sin((float) amplitude) * 40.0;
        double INC = TWO_PI / 50.0;
        amplitude = amplitude + INC;
    }
}
