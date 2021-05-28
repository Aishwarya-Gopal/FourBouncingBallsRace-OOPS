import processing.core.PApplet;

import java.awt.Color;

import static processing.core.PApplet.sin;
import static processing.core.PConstants.TWO_PI;

public class Ball {

    private final PApplet P;
    private final Color COLOR;
    private final int RADIUS;
    private final int VELOCITY;
    private final double Y_POSITION;

    private int x_position;
    private double y_position;
    private double amplitude;

    public Ball(Color color, int x_position, int y_position, int radius, int velocity, PApplet _p) {
        this.COLOR = color;
        this.x_position = x_position;
        this.y_position = 0;
        this.RADIUS = radius;
        this.VELOCITY = velocity;
        this.Y_POSITION = y_position;
        amplitude = 0.1F;
        P = _p;
    }

    public void setColorAndMove() {
        P.fill(this.COLOR.getRed(), this.COLOR.getGreen(), this.COLOR.getBlue());
        P.ellipse(this.x_position, (float) this.y_position, this.RADIUS, this.RADIUS);
        this.moveTheBall();
    }

    private void moveTheBall() {
        this.x_position += this.VELOCITY;
        this.y_position = this.Y_POSITION + sin((float) amplitude) * 40.0;
        double INC = TWO_PI / 50.0;
        amplitude = amplitude + INC;
    }

    public int getX_position() {
        return this.x_position;
    }
}
