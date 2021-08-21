package com.flow.components;

import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;

public class StaticSizeColumn extends JPanel {

    private int size = 0;
    private final int rowCount;

    public StaticSizeColumn(int rowCount) {
        this.rowCount = rowCount;
        setPreferredSize(new Dimension(90, rowCount * 60 + (rowCount * 10)));
    }

    public void addElement(Component component) {
        add(component);
        size++;
    }

    public boolean isFull() {

        return rowCount == size;
    }
}
