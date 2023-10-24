package DesignPatterns.Creational.AbstractFactory.factories;

import DesignPatterns.Creational.AbstractFactory.buttons.*;
import DesignPatterns.Creational.AbstractFactory.checkboxes.*;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
