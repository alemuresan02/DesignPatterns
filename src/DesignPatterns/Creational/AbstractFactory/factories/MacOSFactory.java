package DesignPatterns.Creational.AbstractFactory.factories;

import DesignPatterns.Creational.AbstractFactory.buttons.Button;
import DesignPatterns.Creational.AbstractFactory.buttons.MacOSButton;
import DesignPatterns.Creational.AbstractFactory.checkboxes.Checkbox;
import DesignPatterns.Creational.AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
