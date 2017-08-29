/**
 * Created by Mickaël on 29/08/2017.
 */
public class ProxyImage implements Image {

    // De proxy moet het echte object hebben om dit door te kunnen geven.
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {

        // Singleton
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
     realImage.display();

    }
}
