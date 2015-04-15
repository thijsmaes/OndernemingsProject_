package OndernemingsProject.data.jpa.UI;

import com.vaadin.ui.*;
import OndernemingsProject.data.jpa.support.Login;
import org.vaadin.spring.VaadinUI;

/**
 * Created by thijs on 10/03/15.
 */

@VaadinUI
public class Header {
    //static Button addWine;

    public static VerticalLayout getHeader() {
        VerticalLayout vlTemplateHeader = new VerticalLayout();
        vlTemplateHeader.setSizeFull();
        vlTemplateHeader.setWidth("100%");
        HorizontalLayout firstLine = new HorizontalLayout();
        firstLine.setWidth("100%");
        Label headerLabel = new Label("this really works");
        Label line = new Label("____");
        VerticalLayout loginLayout = createLoginLayout();
        firstLine.addComponent(headerLabel);
        firstLine.addComponent(loginLayout);
        firstLine.setComponentAlignment(headerLabel, Alignment.TOP_LEFT);
        firstLine.setComponentAlignment(loginLayout, Alignment.TOP_RIGHT);
        vlTemplateHeader.addComponent(firstLine);

        HorizontalLayout navigation = createNavigationBar();
        navigation.setSizeUndefined();
        loginLayout.setHeightUndefined();

        headerLabel.setWidthUndefined();
        //navigation= createNavigationBar();

        //vlTemplateHeader.addComponent(headerLabel);
        vlTemplateHeader.addComponent(navigation);
        //vlTemplateHeader.addComponent(loginLayout);
        //vlTemplateHeader.addComponent(line);



        vlTemplateHeader.setComponentAlignment(navigation, Alignment.BOTTOM_CENTER);
       // vlTemplateHeader.setComponentAlignment(line, Alignment.BOTTOM_LEFT);

        return vlTemplateHeader;
    }

    private static HorizontalLayout createNavigationBar() {
        HorizontalLayout navigationBar = new HorizontalLayout();
        Button home = new Button("Home");
        Button champagnes = new Button("Champagnes");
        Button regions = new Button("Regions");
        Button contact = new Button("Contact");
        Button addWine = new Button("Add wine");
        navigationBar.addComponent(home);
        navigationBar.addComponent(champagnes);
        navigationBar.addComponent(regions);
        navigationBar.addComponent(contact);
        navigationBar.addComponent(addWine);
        //addWine.setVisible(false);

        navigationBar.setSpacing(true);
        navigationBar.setWidthUndefined();

        home.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                UI.getCurrent().getNavigator().navigateTo("home");
            }
        });

        champagnes.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                UI.getCurrent().getNavigator().navigateTo("champagnes");
            }
        });

        regions.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                UI.getCurrent().getNavigator().navigateTo("regions");
            }
        });

        contact.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                UI.getCurrent().getNavigator().navigateTo("contact");
            }
        });

        addWine.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                UI.getCurrent().getNavigator().navigateTo("addwine");
            }
        });

        return navigationBar;
    }

    public static VerticalLayout createLoginLayout() {
        final VerticalLayout loginLayout = new VerticalLayout();
        HorizontalLayout loginFields = new HorizontalLayout();
        loginFields.setSizeUndefined();
        final TextField login = new TextField ("Login");
        final TextField password = new TextField("Password");
        Button button = new Button("Sign in");
        loginFields.addComponent(login);
        loginFields.addComponent(password);

        loginLayout.setSizeUndefined();
        loginLayout.addComponent(loginFields);
        loginLayout. addComponent(button);
        //loginLayout.setComponentAlignment(button, Alignment.MIDDLE_RIGHT);

        button.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                String username = login.getValue();
                String pass = password.getValue();
                if (Login.usernameInDatabase(username)) {
                    if(!Login.checkPassWord(username, pass)){
                        Label passNotCorrect = new Label("This password is not correct, please try again");
                        loginLayout.addComponent(passNotCorrect);
                    }
                }
                else{
                    Label userNameNotInDB = new Label("User name is not available in database, please try again or register");
                    loginLayout.addComponent(userNameNotInDB);
                }
                if (username.equals("admin")){
                   // addWine.setVisible(true);
                   // addWine.setEnabled(true);
                }
            }
        });


        return loginLayout;
    }

}
