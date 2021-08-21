import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import java.awt.Dimension;

public class ToolBar extends JPanel {

    private final JSpinner layoutsSpinner;
    private final NumberSpinner rowCountSpinner;
    private final NumberSpinner itemsCountSpinner;

    public ToolBar(PanelManager panelManager) {
        setPreferredSize(new Dimension(0, 70));

        layoutsSpinner = new JSpinner();
        String[] layouts = {"Flow", "Box", "Grid"};
        layoutsSpinner.setModel(new SpinnerListModel(layouts));
        layoutsSpinner.setPreferredSize(new Dimension(90, 20));
        rowCountSpinner = new NumberSpinner("Row count");
        itemsCountSpinner = new NumberSpinner("Items count");
        JButton goButton = new JButton("GO");

        goButton.addActionListener(e -> panelManager.setContent(layoutsSpinner.getValue().toString(),
                rowCountSpinner.getValue(), itemsCountSpinner.getValue()));
        add(layoutsSpinner);
        add(rowCountSpinner);
        add(itemsCountSpinner);
        add(goButton);
    }
}
