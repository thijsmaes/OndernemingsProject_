package OndernemingsProject.data.jpa.UI;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import org.vaadin.spring.VaadinUI;

/**
 * Created by thijs on 10/03/15.
 */

@VaadinUI
public  class Footer {

    public static HorizontalLayout getFooter(){
        HorizontalLayout hlTemplateFooter = new HorizontalLayout();

        Label headerLabel = new Label("yeah baby!");
        hlTemplateFooter.addComponent(headerLabel);
        hlTemplateFooter.setComponentAlignment(headerLabel, Alignment.TOP_RIGHT);
        hlTemplateFooter.setSizeFull();
        return hlTemplateFooter;
    }
}
