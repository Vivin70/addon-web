package jdbc;



import java.sql.*;

public class SimpleStudentDB {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/StudentDB";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
           
            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            addStudent(connection, "Vivin", 20, "CS");
            addStudent(connection, "Harish", 22, "CT");
            addStudent(connection, "Abdul",21,"IT");

            showAllStudents(connection);
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    static void addStudent(Connection conn, String name, int age, String department) throws SQLException {
        String query = "INSERT INTO Students (Name, Age, Department) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setInt(2, age);
        stmt.setString(3, department);
        stmt.executeUpdate();
        System.out.println("Added student: " + name);
        stmt.close();
    }

    
    static void showAllStudents(Connection conn) throws SQLException {
        String query = "SELECT * FROM Students";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println("ID | Name | Age | Department");
        while (rs.next()) {
            int id = rs.getInt("ID");
            String name = rs.getString("Name");
            int age = rs.getInt("Age");
            String dept = rs.getString("Department");

            System.out.println(id + " | " + name + " | " + age + " | " + dept);
        }

        rs.close();
        stmt.close();
    }
}
