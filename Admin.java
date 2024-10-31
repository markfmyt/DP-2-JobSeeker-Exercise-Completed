import java.util.*;
public class Admin extends User{
    
    public Admin(String username){
        super(username);
        //super.userType = "Admin";
    }
    public String getUserType(){
        return "Admin";
    }
}
