package com.panels;

import javax.swing.JPanel;

public abstract class AbstractPanel extends JPanel {

    public void updateView(int rowCount, int itemsCount) {
        removeAll();

        if (rowCount == 0 || itemsCount == 0) {
            return;
        }

        fillRows(rowCount, itemsCount);

        revalidate();
        repaint();
    }


    protected abstract void fillRows(int rowCount, int itemsCount);
}
