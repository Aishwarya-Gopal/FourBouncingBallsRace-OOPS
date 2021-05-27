public class Ball {
    public int RED;
    public int GREEN;
    public int BLUE;
    public int x_position;
    public int y_position;
    public int radius;
    public int velocity;

    public Ball(int RED, int GREEN, int BLUE, int x_position, int y_position, int radius, int velocity) {
        this.RED = RED;
        this.GREEN = GREEN;
        this.BLUE = BLUE;
        this.x_position = x_position;
        this.y_position = y_position;
        this.radius = radius;
        this.velocity = velocity;
    }

    public void moveTheBall() {
        this.x_position += this.velocity;
    }
}
