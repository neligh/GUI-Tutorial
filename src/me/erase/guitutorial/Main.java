package me.erase.guitutorial;

import me.erase.guitutorial.gui.Gui;
import me.erase.guitutorial.listener.GuiListener;

public class Main {
    private static final Gui gui = new Gui();

    public static void main(String[] args) {
        new GuiListener();
    }

    public static Gui getGui() {
        return gui;
    }
}
