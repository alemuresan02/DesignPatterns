package DesignPatterns.Comportamental.Command.commands;

import DesignPatterns.Comportamental.Command.editor.Editor;

public class CopyCommand extends Command{
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
