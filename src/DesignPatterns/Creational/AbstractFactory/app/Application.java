package DesignPatterns.Creational.AbstractFactory.app;

import DesignPatterns.Creational.AbstractFactory.buttons.*;
import DesignPatterns.Creational.AbstractFactory.checkboxes.*;
import DesignPatterns.Creational.AbstractFactory.factories.*;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }

}
