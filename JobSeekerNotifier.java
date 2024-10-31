import java.util.*;

public class JobSeekerNotifier implements Subject
{
    Vector<User> subscribers = new Vector<>();
    
    public JobSeekerNotifier (){
        
    }
    
    public JobSeekerNotifier (Vector<User> subscribers){
        for (User user : subscribers)
            attach(user);
    }
    
    @Override
    public void attach(User user){
        if (!user.getUserType().equals("JobSeeker")){
            System.out.println(user.getUserType());
            subscribers.add(user);
        }
    }
    
    @Override
    public void detach(User user){
        subscribers.remove(user);
    }
    
    @Override
    public void notifyObservers(JobSeeker js){
        for (User s : subscribers){
            s.update(js);
        }
    }   
    
    @Override
    public void newJobSeekerAdded(JobSeeker js){    
        String s = "";
        s += "Everyone will be notified of the new job seeekr " + js.getUserName();
        notifyObservers(js);
    }
}
