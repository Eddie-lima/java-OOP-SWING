import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;

public class PurchasePanel extends JPanel {
    private JTextField cpfField;
    private JTextField totalPriceField;
    private JButton addButton;

    public PurchasePanel() {
        setLayout(new GridLayout(3, 2));

        add(new JLabel("CPF:"));
        cpfField = new JTextField();
        add(cpfField);

        add(new JLabel("Total Price:"));
        totalPriceField = new JTextField();
        add(totalPriceField);

        addButton = new JButton("Add Purchase");
        add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPurchase();
            }
        });
    }

    private void addPurchase() {
        String cpf = cpfField.getText();
        String totalPriceText = totalPriceField.getText();

        if (totalPriceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Total price is required");
            return;
        }

        // Commented out database-related code
        /*
        try (Connection conn = DatabaseHelper.getConnection()) {
            String sql = "INSERT INTO purchase (CPF, total_price, purchase_date) VALUES (?, ?, date('now'))";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, cpf);
                pstmt.setInt(2, Integer.parseInt(totalPriceText));
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Purchase added successfully");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding purchase: " + ex.getMessage());
        }
        */
    }
}
