package samples;
import java.sql.SQLException;

public class Verification {
    public boolean verifyuser(String user, String pass) throws SQLException {
        Connectivity ref = new DataBaseConnection();
        boolean result = ref.isValid(user,pass);
        if(result==true)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
