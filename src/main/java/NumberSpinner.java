import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Dimension;

public class NumberSpinner extends JPanel {

    private final JSpinner spinner = new JSpinner();

    public NumberSpinner(String name) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(Box.createVerticalStrut(15));

        spinner.setModel(new SpinnerNumberModel(0, 0, 50, 1));
        spinner.setEditor(new JSpinner.DefaultEditor(spinner));
        spinner.setPreferredSize(new Dimension(80, 20));

        add(spinner);

        JLabel label = new JLabel(name);
        add(label);
    }

    public Integer getValue() {
        return Integer.valueOf(spinner.getValue().toString());
    }
}
