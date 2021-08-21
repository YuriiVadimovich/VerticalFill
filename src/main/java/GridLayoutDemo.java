import javax.swing.JFrame;
import java.awt.BorderLayout;

public class GridLayoutDemo extends JFrame {

    public GridLayoutDemo() {
        super("GridLayoutTest");
        setSize(1200, 1200);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setLayout(new BorderLayout());

        PanelManager panelManager = new PanelManager();
        add(panelManager, BorderLayout.CENTER);

        ToolBar toolBar = new ToolBar(panelManager);
        add(toolBar, BorderLayout.NORTH);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
