package OndernemingsProject.data.jpa.UI;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.spring.VaadinUI;

/**
 * Created by thijs on 17/03/15.
 */
@VaadinUI
public class AddWine extends Template {

    public VerticalLayout getBody(){
        VerticalLayout vl = new VerticalLayout();
        vl.setSizeFull();

        HorizontalLayout name = new HorizontalLayout();
        Label n = new Label("Name: ");
        TextField na = new TextField();
        name.addComponent(n);
        name.addComponent(na);

        HorizontalLayout producer = new HorizontalLayout();
        Label p = new Label("Name producer: ");
        TextField pr = new TextField();
        producer.addComponent(p);
        producer.addComponent(pr);

        HorizontalLayout address = new HorizontalLayout();
        Label street = new Label("Street");
        TextField str = new TextField();
        Label number = new Label("Number: ");
        TextField num = new TextField();
        Label postalCode = new Label("Postal Code");
        TextField post = new TextField();
        Label city = new Label("City");
        TextField cit = new TextField();
        address.addComponent(street);
        address.addComponent(str);
        address.addComponent(number);
        address.addComponent(num);
        address.addComponent(postalCode);
        address.addComponent(post);
        address.addComponent(city);
        address.addComponent(cit);

        HorizontalLayout picture = new HorizontalLayout();
        Label addPic = new Label("Add picture: ");

        vl.addComponent(name);
        vl.addComponent(producer);
        vl.addComponent(address);

        return vl;
    }
}
