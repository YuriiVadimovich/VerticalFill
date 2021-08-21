package com.panels;

import com.box.components.CountedPanel;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.util.ArrayList;
import java.util.List;

public class BoxLayoutPanel extends AbstractPanel {

    public BoxLayoutPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    @Override
    public void fillRows(int rowCount, int itemsCount) {

        int columns = (itemsCount % rowCount) == 0 ? (itemsCount / rowCount) : (itemsCount / rowCount) + 1;

        List<CountedPanel> rowPanels = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            CountedPanel wrapper = new CountedPanel(columns);
            rowPanels.add(wrapper);
        }

        int rowIndex = 0;
        for (int i = 0; i < itemsCount; i++) {

            if (rowIndex >= rowPanels.size()) {
                rowIndex = 0;
            }

            JButton button = new JButton(String.valueOf(i + 1));
            rowPanels.get(rowIndex).addElement(button);
            rowIndex++;
        }

        for (CountedPanel rowPanel : rowPanels) {
            rowPanel.addFakeElement();
            add(rowPanel);
        }
    }
}
