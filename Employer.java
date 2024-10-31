import java.util.*;
class Employer extends User{
    
    public Employer(String username){
        super(username);
        //super.userType = "Employer";
    }
    
    public String getUserType(){
        return "Employer";
    }
}

