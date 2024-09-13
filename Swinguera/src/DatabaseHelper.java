import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHelper {

    public static void main(String[] args) {
        
        // Ensure the JDBC URL is correct and points to the database file
        String jdbcUrl = "jdbc:sqlite:/lib/database/test.db";
        
        try (Connection connection = DriverManager.getConnection(jdbcUrl);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM product")) {

            // Process the results
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                String description = resultSet.getString("description");

                System.out.println(productId + " | " + description);
            }

        } catch (SQLException e) {
            System.out.println("Error Connecting to SQLite Database");
            e.printStackTrace();
        }
    }
}
