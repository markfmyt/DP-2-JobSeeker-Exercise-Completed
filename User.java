import java.util.*;
public class User implements Observer{
    private String username;
    //protected String userType;
    
    Vector <String> notifications = new Vector<>();
    public User(String username){
        this.username = username;
    }
    
    public String getUserName(){
        return this.username;
    }
    
    @Override
    public void update (JobSeeker js){
        String notification = "";
        notification+="Hello " + this.username + 
        ", a new Job Seeker has joined the platform and his skilles are: ";
        
        for (String skill : js.skills){
            notification += skill + ", ";
        }
        notifications.add(notification);
        System.out.println(notification);
    }
    
    public String getUserType(){
        return "User";
    }
 
}
