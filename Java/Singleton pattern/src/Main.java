public class Main {

    public static void main(String[] args) {

        Singleton s = new Singleton();

        // De eerste keer is er nog geen instantie aangemaakt dus dan zal hij er een voorzien.
        s.getInstance();

        // De tweede keer bestaat deze al en zal er een bericht weergegeven worden.
        s.getInstance();


    }
}
