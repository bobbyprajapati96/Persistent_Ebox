package jdbc.iasses.first;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
public class UserDAO{
public UserDAO(){}
    public static ArrayList<User> listUsers() throws Exception{
    	ArrayList<User> userList = new ArrayList<User>();
    	//fill your code here
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM \"user\"");
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Integer age = rs.getInt("age");
                String role = rs.getString("role");
                Date createdDate = rs.getDate("created_date");
                String status = rs.getString("status");
                User user = new User(id, name, email, password, age, role, createdDate, status);
                userList.add(user);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
    }
    return userList;
}
    
    public static void deleteUser(Integer id) throws Exception{
       try {
        Connection conn = DBConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM \"user\" WHERE id=?");
        stmt.setInt(1, id);
        stmt.executeUpdate();
        conn.close();
    } catch (Exception e) {
        System.out.println(e);
    }
}
}