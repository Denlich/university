package pixel;

public class Main {
    public static void main(String[] args) {
        ColourfulPixel pixel1 = new ColourfulPixel(2, 2, "#fff", 0.1);
        System.out.println(pixel1.changeProperties("#f00"));

        ColourfulPixel pixel2 = new ColourfulPixel(5, 1);
        System.out.println(pixel2.newCoordinates(1, 1));

        ColourfulPixel pixel3 = new ColourfulPixel(1, 2);
        System.out.println(pixel3.changeProperties(.5));

        ColourfulPixel pixel4 = new ColourfulPixel();
        System.out.println(pixel4.changeProperties("#333", 1));

        ColourfulPixel pixel5 = new ColourfulPixel();
        System.out.println(pixel5.changeProperties());

        ColourfulPixel pixel6 = new ColourfulPixel();

        System.out.println(pixel1.hashCode());
        System.out.println(pixel1.equals(pixel2));

        System.out.println(pixel5.hashCode());
        System.out.println(pixel6.hashCode());
        System.out.println(pixel5.equals(pixel6));

        ColourfulPixel pixel7 = new ColourfulPixel(1,2,"#f00", 1);
        ColourfulPixel pixel8 = new ColourfulPixel(1, 1, "#f00", 1);
        System.out.println(pixel7.equals(pixel8));
    }
}