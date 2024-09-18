import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;

public class ProductPanel extends JPanel {
    private JTextField codeField;
    private JTextField descriptionField;
    private JTextField priceField;
    private JButton addButton;
    private JTextArea productListArea;

    public ProductPanel() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        inputPanel.add(new JLabel("Code:"));
        codeField = new JTextField();
        inputPanel.add(codeField);

        inputPanel.add(new JLabel("Description:"));
        descriptionField = new JTextField();
        inputPanel.add(descriptionField);

        inputPanel.add(new JLabel("Price:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        addButton = new JButton("Add Product");
        inputPanel.add(addButton);

        productListArea = new JTextArea();
        productListArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(productListArea), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });

        // Commented out database-related method call
        // loadProducts();
    }

    private void addProduct() {
        String code = codeField.getText();
        String description = descriptionField.getText();
        String priceText = priceField.getText();

        if (code.isEmpty() || description.isEmpty() || priceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            return;
        }

        // Commented out database-related code
        /*
        try (Connection conn = DatabaseHelper.getConnection()) {
            String sql = "INSERT INTO product (code, description, price) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, code);
                pstmt.setString(2, description);
                pstmt.setInt(3, Integer.parseInt(priceText));
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product added successfully");
                loadProducts();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding product: " + ex.getMessage());
        }
        */
    }

    private void loadProducts() {
        productListArea.setText("");
        
        // Commented out database-related code
        /*
        try (Connection conn = DatabaseHelper.getConnection()) {
            String sql = "SELECT * FROM product";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    productListArea.append("ID: " + rs.getInt("product_id") +
                                           ", Code: " + rs.getString("code") +
                                           ", Description: " + rs.getString("description") +
                                           ", Price: " + rs.getInt("price") + "\n");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error loading products: " + ex.getMessage());
        }
        */
    }
}
