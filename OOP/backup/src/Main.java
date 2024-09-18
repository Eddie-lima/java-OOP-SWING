import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Database Management App");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 400);
                frame.setLayout(new BorderLayout());

                JTabbedPane tabbedPane = new JTabbedPane();
                tabbedPane.addTab("Products", new ProductPanel());
                tabbedPane.addTab("Purchases", new PurchasePanel());

                frame.add(tabbedPane, BorderLayout.CENTER);
                frame.setVisible(true);
            }
        });
    }
}

