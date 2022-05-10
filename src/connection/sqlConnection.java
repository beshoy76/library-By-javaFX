package connection;

import javafx.scene.control.Alert;
import java.sql.*;
import java.time.LocalDate;

public class sqlConnection {

    public void setConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    Connection connection;

    public void insertRecord(String username, String email, String pass, String phone, LocalDate birth, String Gender)  {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/book","root","");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users " +
                    "(user_name,Email,password,phone_number,birth,gender) VALUES(?,?,?,?,?,?)");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,pass);
            preparedStatement.setString(4,phone);
            preparedStatement.setDate(5,Date.valueOf(birth));
            preparedStatement.setString(6,Gender);

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();

        } catch (SQLException e){
            printSQLException(e);
        }

    }

    public Boolean compareRecord(String username, String pass) throws SQLException {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/book","root","");
            PreparedStatement statement = connection.prepareStatement("select * from users where user_name=? and password=?");
            statement.setString(1, username);
            statement.setString(2, pass);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                return true;
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Form Error!");
            alert.setHeaderText(null);
            alert.setContentText("your username or password isn't correct");
            alert.show();

        } catch (SQLException e){
            printSQLException(e);
        }
        return false;
    }

    public String[] result(int ID) throws SQLException {
        String[] book = new String[4];
        Boolean flag= false;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/book", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from books ");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                if (ID == id) {
                    flag= true;
                    String title = resultSet.getString("title");
                    String brief = resultSet.getString("brief");
                    String author = resultSet.getString("author");
                    String publish_year = resultSet.getString("publish_year");
                    book = new String[]{title, brief, author, publish_year};
                }
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        if (!flag){
            return new String[]{"not found"};
        }
        return book;
    }



    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}
