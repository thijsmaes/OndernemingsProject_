package OndernemingsProject.data.jpa.UI;

import com.vaadin.ui.*;
import org.vaadin.spring.VaadinUI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thijs on 12/03/15.
 */

@VaadinUI
public class Champagnes extends Template {

    GridLayout champagnes;
    VerticalLayout possibleChoice;
    List<VerticalLayout> possibleChoices;

    public VerticalLayout getBody() {
        VerticalLayout vl = new VerticalLayout();
        HorizontalLayout hl = new HorizontalLayout();
        Panel champagneFilter = new Panel();
        VerticalLayout champagneFilterVl = new VerticalLayout();
        champagneFilter.setContent(champagneFilterVl);
        champagnes = new GridLayout(100, 100);

        hl.addComponent(champagneFilter);
        champagneFilterVl.setSpacing(true);
        champagneFilterVl.setMargin(true);
        hl.addComponent(champagnes);
        hl.setExpandRatio(champagneFilter, 1f);
        hl.setExpandRatio(champagnes, 4f);
        hl.setSpacing(true);
        //champagneFilter.setWidth("100px");

        champagneFilterVl.addComponent(getSearchLayout());

        vl.addComponent(hl);

        champagnes.setSpacing(true);
        fillChampagnes();

        return vl;
    }

    private VerticalLayout getSearchLayout() {
        VerticalLayout champagneSearch = new VerticalLayout();

        OptionGroup grapes = new OptionGroup("Grapes");
        grapes.setMultiSelect(true);
        grapes.addItems("Pinot Noir", "Chardonnay", "Merlot", "autre");
        champagneSearch.addComponent(grapes);

        OptionGroup regions = new OptionGroup("Regions");
        regions.setMultiSelect(true);
        regions.addItems("North", "East", "South", "West");
        champagneSearch.addComponent(regions);

        OptionGroup price = new OptionGroup("Price");
        //price.setMultiSelect(true);
        price.addItems("< 15€", "15€ - 25€", "25€ - 50€", "> 50€", "All");
        champagneSearch.addComponent(price);

        Button addWine = new Button("Add wine");
        addWine.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                UI.getCurrent().getNavigator().navigateTo("addwine");
            }
        });

        champagneSearch.addComponent(addWine);

        return champagneSearch;
    }

    private void fillChampagnes() {
        createPossibleChoices();
        for (VerticalLayout vl: possibleChoices) {
            champagnes.addComponent(vl);
        }
    }

    private void createPossibleChoices() {
        possibleChoices = new ArrayList<VerticalLayout>();
        List<Label> champagneLabels = new ArrayList<Label>();
        /*Label c1 = */ champagneLabels.add(new Label("Champagne 1"));
        /*Label c2 = */ champagneLabels.add(new Label("Champagne 2"));
        /*Label c3 = */ champagneLabels.add(new Label("Champagne 3"));
        /*Label c4 = */ champagneLabels.add(new Label("Champagne 4"));
        /*Label c5 = */ champagneLabels.add(new Label("Champagne 5"));

        List<Image> champagneImages = new ArrayList<Image>();
        /*Image img1 = */ champagneImages.add(new Image());
        Image img2 = new Image();
        Image img3 = new Image();
        Image img4 = new Image();
        Image img5 = new Image();

        for (int i=0; i<4; i++){
            possibleChoice = new VerticalLayout();
            possibleChoice.addComponent(champagneLabels.get(i));
            possibleChoice.addComponent(new Image());
            possibleChoice.addComponent(new Button());
            /*.addClickListener(new Button.ClickListener() {
                @Override
                public void buttonClick(Button.ClickEvent clickEvent) {

                }
            }););                  */

            possibleChoices.add(possibleChoice);
        }


    }
}
