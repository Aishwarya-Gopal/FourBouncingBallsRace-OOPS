import processing.core.PApplet;

import java.awt.*;

public class Sketch {
    private final int WIDTH;
    private final int HEIGHT;
    private final Color BACKGROUND_COLOR;
    private PApplet p;

    public Sketch(int width, int height, Color backgroundColor, PApplet _p) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.BACKGROUND_COLOR = backgroundColor;
        p = _p;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setBlackBackground() {
        p.background(this.BACKGROUND_COLOR.getRGB());
    }
}
