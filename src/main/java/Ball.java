import java.awt.*;

import static processing.core.PApplet.sin;
import static processing.core.PConstants.TWO_PI;

public class Ball {

    public Color color;
    public int x_position;
    public double y_position;
    public int radius;
    public int velocity;

    private double amplitude;
    private final double Y_POSITION;

    public Ball(Color color, int x_position, int y_position, int radius, int velocity) {
        this.color = color;
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
