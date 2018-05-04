package zhushen.thinkinginjava.chapter2_Object.Exercise_11;

public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args){
        AllTheColorsOfTheRainbow all = new AllTheColorsOfTheRainbow();
        all.changeTheHueOfTheColor(27);
    }
}
