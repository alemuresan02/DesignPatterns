package DesignPatterns.Creational.FactoryMethod.factory;

import DesignPatterns.Creational.FactoryMethod.buttons.*;

public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
