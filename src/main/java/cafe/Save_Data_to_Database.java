package cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Save_Data_to_Database {

   public static void saveOrderToDatabase(double total) {
        String url = "jdbc:mysql://localhost:3306/cafe_management";
        String username = "root";
        String password = "";

        
        String query = "INSERT INTO orderdata (amount) VALUES (?)";

        
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            
            pstmt.setDouble(1, total);

            pstmt.executeUpdate();

            System.out.println("Order saved to database with total: " + total);

        } catch (SQLException e) {
            System.out.println("Error saving order to database.");
        }
    }

}
