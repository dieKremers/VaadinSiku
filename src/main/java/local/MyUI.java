package local;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;


/**
 *
 */
@Theme("mytheme")
@Widgetset("local.MyAppWidgetset")
public class MyUI extends UI {
    final ListSelect driverList = new ListSelect("driverList");

    @Override
    protected void init(VaadinRequest vaadinRequest) 
    {
        //Main Page
    	final VerticalLayout layout = new VerticalLayout();
        HorizontalSplitPanel horizontalMainPanel = new HorizontalSplitPanel();

        //left part
        VerticalSplitPanel leftVerticalPanel = new VerticalSplitPanel();     
        HorizontalSplitPanel leftBottomHorizontalPanel = new HorizontalSplitPanel();
        Button buttonAddDriver = new Button("Add Driver");
        Button buttonDeleteDriver = new Button("Delete Driver");        

        //main part
        Image driverImage = new Image();
        
        
        int browserWindowheight = getPage().getBrowserWindowHeight();
        
        
        // Build Layout
        layout.setHeight(browserWindowheight, Unit.PIXELS);
        horizontalMainPanel.setHeight(100, Unit.PERCENTAGE);
        horizontalMainPanel.setSplitPosition(40, Unit.PERCENTAGE);
        leftVerticalPanel.setHeight(80, Unit.PERCENTAGE);
        leftVerticalPanel.setSplitPosition(80, Unit.PERCENTAGE);
        driverList.setWidth(95, Unit.PERCENTAGE);
        driverList.setHeight(95, Unit.PERCENTAGE);
        leftBottomHorizontalPanel.addComponent(buttonAddDriver);
        leftBottomHorizontalPanel.addComponent(buttonDeleteDriver);
        horizontalMainPanel.addComponent(leftVerticalPanel);
        horizontalMainPanel.addComponent(driverImage);
        leftVerticalPanel.addComponent(driverList);
        leftVerticalPanel.addComponent(leftBottomHorizontalPanel);
        layout.addComponent(horizontalMainPanel);
        layout.setMargin(true);
        setContent(layout);
        

        buttonAddDriver.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) 
            {
                driverList.addItem("Michael");
            }
        });
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
