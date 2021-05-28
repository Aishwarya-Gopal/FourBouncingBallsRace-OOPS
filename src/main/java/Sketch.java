import processing.core.PApplet;

import java.awt.Color;

public class Sketch {

    private final int WIDTH;
    private final int HEIGHT;
    private final Color BACKGROUND_COLOR;
    private final PApplet P;

    public Sketch(int width, int height, Color backgroundColor, PApplet _p) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.BACKGROUND_COLOR = backgroundColor;
        P = _p;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setBlackBackground() {
        P.background(this.BACKGROUND_COLOR.getRGB());
    }
}
