package me.erase.guitutorial.gui;


import javax.swing.*;
import java.awt.*;

public class Gui {
    private GuiComponents components = new GuiComponents();

    public Gui() {
        setupFrame();
        setupPanels();
        setupButtons();
        addPaneComponents();
        applyLookAndFeel();
        applyCloseOperation();
        showFrame();
    }

    private void setupFrame() {
        components.frame.setSize(350, 200);
        components.frame.setLayout(null);
        components.frame.setResizable(false);
    }

    private void setupPanels() {
        components.contentPane.setBounds(components.frame.getBounds());
        components.contentPane.setLayout(null);
        components.contentPane.setBackground(new Color(30, 30, 90));
        components.frame.setContentPane(components.contentPane);
    }

    private void setupButtons() {
        components.buttonPrint.setBounds(100, 60, 120, 40);
        components.buttonPrint.setText("Print Hello!");
        components.buttonPrint.setFocusable(false);
    }

    private void addPaneComponents() {
        components.contentPane.add(components.buttonPrint);
    }

    private void showFrame(){
        components.frame.setVisible(true);
    }

    private void applyCloseOperation() {
        components.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void applyLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public GuiComponents getGuiComponents() {
        return components;
    }
}
