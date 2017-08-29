public class Main {

    public static void main(String[] args) {

        // ProxyImage spreekt de RealImage aan
        Image image = new ProxyImage("testImage.jpg");

        // Door gebruik te maken van een Singleton in de Proxy wordt er maar 1 instantie ingeladen van de echte afbeelding
        // Daardoor gaat hij deze maar 1 keer inladen van de disk
        image.display();
        System.out.println("");

        // Doordat er al een instantie van de echte afbeelding bestaat gaat hij niet meer de constructor van de echte
        // Afbeelding aanspreken.
        image.display();
    }
}
