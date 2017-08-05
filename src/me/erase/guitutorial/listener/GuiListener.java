package me.erase.guitutorial.listener;

import me.erase.guitutorial.Main;
import me.erase.guitutorial.gui.Gui;
import me.erase.guitutorial.gui.GuiComponents;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiListener {
    private Gui gui = Main.getGui();
    private GuiComponents components = gui.getGuiComponents();

    public GuiListener() {
        addMouseListeners();
    }

    private void addMouseListeners() {
        components.buttonPrint.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Hello!");
            }
        });
    }
}
