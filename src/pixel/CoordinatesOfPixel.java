package pixel;

import java.util.Objects;

public abstract class CoordinatesOfPixel {
    private final int x;
    private final int y;

    public CoordinatesOfPixel() {
        x = 0;
        y = 0;
    }

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
        return "Coordinates {" + "x=" + x + ", y=" + y + "} ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        CoordinatesOfPixel coordinatesOfPixel = (CoordinatesOfPixel) o;

        return getX() == coordinatesOfPixel.getX() &&
                getY() == coordinatesOfPixel.getY();
    }
}
