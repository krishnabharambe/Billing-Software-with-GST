package login;

import Database.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDbController {

    public static boolean UserAuth(String username,String Password){
        int i = 0;
       ResultSet data = db.getdata("Select count(*) as checker from usermanager where username='"+username+"' AND password='"+Password+"'");
        try {
            i = data.getInt("checker");
            data.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (i==1){
            return true;
        }else return false;


    }
}
