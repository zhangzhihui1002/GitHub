package SRP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {

    private DBUtil db=null;
    public UserDAO() {
         
    }
    boolean findUser(String userId,String userPwd)
    {
        db=new DBUtil();
        Connection connection=db.getConnection();
        try
        {
            Statement sql=connection.createStatement();
            ResultSet resultSet=sql.executeQuery("select * from user where name='"+userId+"' and password='"+userPwd+"'");
             
            resultSet.last();
            if(resultSet.getRow()<1) return false;
            else return true;
            
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}