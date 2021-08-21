package com.panels;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class GridLayoutPanel extends AbstractPanel {

    // rows and cols cannot both be zero
    private final GridLayout gridLayout = new GridLayout(1, 0, 5, 12);

    public GridLayoutPanel() {
        setLayout(gridLayout);
    }

    @Override
    public void fillRows(int rowCount, int itemsCount) {

        int columns = (itemsCount % rowCount) == 0 ? (itemsCount / rowCount) : (itemsCount / rowCount) + 1;
        gridLayout.setRows(rowCount);
        gridLayout.setColumns(columns);

        for (int i = 0; i < rowCount; i++) {
            for (int col = 0; col < columns; col++) {
                if ((col * rowCount) + i < itemsCount) {
                    add(new JButton(String.valueOf(i + (col * rowCount) + 1)));
                } else {
                    add(new JPanel());
                }
            }
        }
    }
}
