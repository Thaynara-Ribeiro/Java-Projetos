public class Fahrenheit {
    public static void main (String[] args) {
        double temperaturaF = 75.5;
        final int CONSTANTE1 = 32;
        final double CONSTANTE2 = 5.0/9.0;
        double temperaturaC = (temperaturaF - CONSTANTE1) * CONSTANTE2;
        temperaturaC = Math.round(temperaturaC);
        System.out.println("A temperatura em Celcius: " + temperaturaC);
    }
}
