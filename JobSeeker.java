import java.util.*;

public class JobSeeker extends User{
    Vector <String> skills = new Vector<>();
    
    public JobSeeker(String username){
        super(username);
        //super.userType = "JobSeeker";
    }
    
    public JobSeeker(String username, Vector<String> skills){
        this(username);
        this.skills = skills;
    }
    
    @Override
    public String getUserType(){
        return "JobSeeker";
    }
}
