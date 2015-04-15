package OndernemingsProject.data.jpa.UI;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.spring.VaadinUI;

/**
 * Created with IntelliJ IDEA.
 * User: thijs
 * Date: 5/03/15
 * Time: 07:44
 * To change this template use File | Settings | File Templates.
 */
@VaadinUI

@Theme("vado")
public class Template extends VerticalLayout implements View {

    //@Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        //To change body of implemented methods use File | Settings | File Templates.     Ge kunt ook gewoon ne update doen ipv volledige restart gaat sneller
    }

    public Template(){
        setSizeFull();
        //setRows(3);

        /*setRowExpandRatio(0, 0.25f);
        setRowExpandRatio(1, 0.5f);
        setRowExpandRatio(2, 0.25f);*/

        VerticalLayout header = Header.getHeader();
        VerticalLayout body = getBody();
        HorizontalLayout footer = Footer.getFooter();

        addComponent(header);
        addComponent(body);
        addComponent(footer);

        //header.setSizeUndefined();
        //header.setSizeFull();
        header.setWidth("100%");
        header.setHeight("100px");
        header.setSpacing(true);
        //header.setMargin(true);
        //body.setMargin(true);
        body.setSizeFull();
        //footer.setMargin(true);
        footer.setHeight("100px");


        setComponentAlignment(header, Alignment.TOP_CENTER);
        //setComponentAlignment(body, Alignment.TOP_CENTER);
        setComponentAlignment(footer, Alignment.BOTTOM_CENTER);
//        header.

    }

    public VerticalLayout getBody(){
        VerticalLayout vlTemplate = new VerticalLayout();
        Label welcome = new Label("Welcome to this site...this is the default filling, " +
                "something must have gone terribly wrong");
        return vlTemplate;
    }
}
