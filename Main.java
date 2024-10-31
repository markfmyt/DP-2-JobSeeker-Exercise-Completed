import java.util.*;
public class Main
{
    public static void main (String[]args){
        Vector <User> users = new Vector<>();
        
        users.add(new Employer("davyn"));
        users.add(new Employer("guardian"));
        users.add(new JobSeeker("bob", new Vector<>(Arrays.asList("Backend"))));

        
        Subject JSN = new JobSeekerNotifier(users);
        Vector <String> skills = new Vector<>();
        skills.add("Backend Development");
        skills.add("Competitive Programming");
        
        JobSeeker markfmyt = new JobSeeker("markfmyt",skills);
        JSN.notifyObservers(markfmyt);
    }
}


