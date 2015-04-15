// tis opgelost, maar ge zit nog met een probleem é :) het is iets kleins da heb ik direct opgelost :)
package OndernemingsProject.data.jpa.UI;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.spring.VaadinUI;

/**
 * Created with IntelliJ IDEA.
 * User: thijs
 * Date: 20/01/15
 * Time: 22:45
 * To change this template use File | Settings | File Templates.
 */
@VaadinUI

public class Home extends Template {

    Navigator navigator;

    public Home(){
        getBody();
    }

    @Override
    public VerticalLayout getBody(){
        VerticalLayout vlHomeBody = new VerticalLayout();
        Label space = new Label("" +
                "");
        Button button = new Button("It works");
        vlHomeBody.addComponent(button);
        button.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                UI.getCurrent().getNavigator().navigateTo("champagnes");
            }
        });
        return vlHomeBody;
    }

    /*@Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        //To change body of implemented methods use File | Settings | File Templates.
    }*/
}
