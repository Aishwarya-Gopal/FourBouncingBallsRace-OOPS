import processing.core.PApplet;

import java.awt.*;

import static processing.core.PApplet.sin;
import static processing.core.PConstants.TWO_PI;

public class Ball {
    PApplet p;

    private Color color;
    private int x_position;
    private double y_position;
    private int radius;
    private int velocity;

    private double amplitude;
    private final double Y_POSITION;

    public Ball(Color color, int x_position, int y_position, int radius, int velocity, PApplet _p) {
        this.color = color;
        this.x_position = x_position;
        this.y_position = 0;
        this.radius = radius;
        this.velocity = velocity;
        this.Y_POSITION = y_position;
        amplitude = 0.1F;
        p = _p;
    }

    public void setColorAndMove() {
        p.fill(this.color.getRed(), this.color.getGreen(), this.color.getBlue());
        p.ellipse(this.x_position, (float) this.y_position, this.radius, this.radius);
        this.moveTheBall();
    }

    private void moveTheBall() {
        this.x_position += this.velocity;
        this.y_position = this.Y_POSITION + sin((float) amplitude) * 40.0;
        double INC = TWO_PI / 50.0;
        amplitude = amplitude + INC;
    }

    public int getX_position() {
        return this.x_position;
    }
}
