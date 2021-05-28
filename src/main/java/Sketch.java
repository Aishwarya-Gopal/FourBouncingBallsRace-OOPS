import java.awt.*;

public class Sketch {
    private final int WIDTH;
    private final int HEIGHT;
    private final Color BACKGROUND_COLOR;

    public Sketch(int width, int height, Color backgroundColor) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.BACKGROUND_COLOR = backgroundColor;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getBACKGROUND_COLOR() {
        return BACKGROUND_COLOR.getRGB();
    }
}
