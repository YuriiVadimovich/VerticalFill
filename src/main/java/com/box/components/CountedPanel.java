package com.box.components;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;

public class CountedPanel extends JPanel {

    private final int totalItemCount;
    private int currentItemsCount;

    public CountedPanel(int totalItemCount) {
        this.totalItemCount = totalItemCount;
        setMaximumSize(new Dimension(totalItemCount * 50, 80));
    }

    public void addElement(Component component) {
        add(component);
        currentItemsCount++;
    }

    public void addFakeElement() {
        if (totalItemCount - currentItemsCount > 0) {
            JButton button = new JButton("");
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
            add(button);
        }
    }
}
