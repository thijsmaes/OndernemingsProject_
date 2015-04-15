package OndernemingsProject.data.jpa.entities;


import com.vaadin.ui.Image;

/**
 * Created by thijs on 10/03/15.
 */
public class Champagne {
    private Producer producer;
    private Image image;
    String description;

    public Champagne(String name, Producer producer, Image image){

        setImage(image);
    }

    private void setImage(Image image) {
        this.image = image;
    }


}
