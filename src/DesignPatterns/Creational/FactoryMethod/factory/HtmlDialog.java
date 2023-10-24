package DesignPatterns.Creational.FactoryMethod.factory;

import DesignPatterns.Creational.FactoryMethod.buttons.*;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
