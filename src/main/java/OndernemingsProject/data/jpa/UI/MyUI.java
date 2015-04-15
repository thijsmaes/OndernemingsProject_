package OndernemingsProject.data.jpa.UI;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.VaadinUI;


import javax.servlet.annotation.WebServlet;

/**
 * Created by thijs on 8/03/15.
 */

@VaadinUI
public class MyUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = MyUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        // TODO Auto-generated method stub
        VerticalLayout vl = new VerticalLayout();
        vl.setSizeFull();
        final Panel panel = new Panel();
        vl.addComponent(panel);
        panel.setHeight("100%");
        panel.setWidth("80%");
        vl.setComponentAlignment(panel, Alignment.BOTTOM_CENTER);

        Navigator navigator = new Navigator(getUI(), panel);
        setNavigator(navigator);
        getNavigator().addView("home", Home.class);
        getNavigator().addView("champagnes", Champagnes.class);
        getNavigator().addView("regions", Regions.class);
        getNavigator().addView("contact", Contact.class);
        getNavigator().addView("addwine", AddWine.class);

        navigator.navigateTo("home");
        setContent(vl);

    }
}
