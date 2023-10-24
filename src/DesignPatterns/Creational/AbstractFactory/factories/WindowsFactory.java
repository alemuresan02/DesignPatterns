package DesignPatterns.Creational.AbstractFactory.factories;

import DesignPatterns.Creational.AbstractFactory.buttons.Button;
import DesignPatterns.Creational.AbstractFactory.buttons.WindowsButton;
import DesignPatterns.Creational.AbstractFactory.checkboxes.Checkbox;
import DesignPatterns.Creational.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
