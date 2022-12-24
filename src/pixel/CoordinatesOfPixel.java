package pixel;

public abstract class CoordinatesOfPixel {
    private final int x;
    private final int y;

    public CoordinatesOfPixel(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public abstract CoordinatesOfPixel newCoordinates(int x, int y);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "PixelParam {" + "x=" + x + ", y=" + y + '}';
    }
}
