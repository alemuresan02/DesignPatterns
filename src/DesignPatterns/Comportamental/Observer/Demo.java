package DesignPatterns.Comportamental.Observer;

import DesignPatterns.Comportamental.Observer.editor.Editor;
import DesignPatterns.Comportamental.Observer.listener.EmailNotificationListener;
import DesignPatterns.Comportamental.Observer.listener.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
