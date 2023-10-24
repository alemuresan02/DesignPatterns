package DesignPatterns.Creational.FactoryMethod.factory;

import DesignPatterns.Creational.FactoryMethod.buttons.*;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}