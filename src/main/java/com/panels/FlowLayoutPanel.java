package com.panels;

import com.flow.components.StaticSizeColumn;

import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class FlowLayoutPanel extends AbstractPanel {

    public FlowLayoutPanel() {
        FlowLayout experimentLayout = new FlowLayout(FlowLayout.LEFT);
        setLayout(experimentLayout);
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    public void fillRows(int rowCount, int itemsCount) {

        int columns = (itemsCount % rowCount) == 0 ? (itemsCount / rowCount) : (itemsCount / rowCount) + 1;
        setPreferredSize(new Dimension(
                columns * 80 + (columns * 10) + 100,
                rowCount * 40));

        int buttonCounter = 1;
        for (int i = 0; i < columns; i++) {
            StaticSizeColumn staticSizeColumn = new StaticSizeColumn(rowCount);
            while(itemsCount > 0 && !staticSizeColumn.isFull()) {
                staticSizeColumn.addElement(new JButton(String.valueOf(buttonCounter)));
                buttonCounter++;
                itemsCount--;
            }
            add(staticSizeColumn);
        }
    }
}
