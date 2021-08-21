import com.panels.AbstractPanel;
import com.panels.BoxLayoutPanel;
import com.panels.FlowLayoutPanel;
import com.panels.GridLayoutPanel;

import javax.swing.JPanel;

public class PanelManager extends JPanel {

    private AbstractPanel content;

    public PanelManager() {}

    public void setContent(String panelName, int rowCount, int itemsCount) {
        removeAll();

        if (panelName.equals("Grid")) {
            content = new GridLayoutPanel();
        }

        if (panelName.equals("Box")) {
            content = new BoxLayoutPanel();
        }

        if (panelName.equals("Flow")) {
            content = new FlowLayoutPanel();
        }

        content.updateView(rowCount, itemsCount);

        add(content);
        revalidate();
        repaint();
    }

}
