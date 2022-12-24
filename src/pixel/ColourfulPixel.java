package pixel;

public class ColourfulPixel extends CoordinatesOfPixel {
    private final String colour;
    private final double opacity;

    /*
    * Here we are overloading constructor of the ColourfulPixel class
    * */

    public ColourfulPixel(int x, int y) {
        super(x, y);
        this.colour = "#fff";
        this.opacity = 1.0F;
    }

    public ColourfulPixel(int x, int y, String colour, double opacity) {
        super(x, y);
        this.colour = colour;
        this.opacity = opacity;
    }

    /*
    * Here we are override newCoordinates method from abstract class CoordinatesOfPixel
    * */

    @Override
    public CoordinatesOfPixel newCoordinates(int x, int y) {
        return new ColourfulPixel(x, y, getColour(), getOpacity());
    }

    /*
    * Here we are overloading changeProperties method
    * */

    public ColourfulPixel changeProperties(String colour, double opacity) {
        return new ColourfulPixel(getX(), getY(), colour, opacity);
    }

    public ColourfulPixel changeProperties(String colour) {
        return new ColourfulPixel(getX(), getY(), colour, getOpacity());
    }

    public ColourfulPixel changeProperties(double opacity) {
        return new ColourfulPixel(getX(), getY(), getColour(), opacity);
    }

    /*
    * Here are getters
    * */

    public String getColour() {
        return colour;
    }

    public double getOpacity() {
        return opacity;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + "colour='" + colour + '\'' + ", opacity=" + opacity + '}';
    }
}
