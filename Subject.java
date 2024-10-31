interface Subject{
    void notifyObservers(JobSeeker js);
    void attach(User user);
    void detach(User user);
    void newJobSeekerAdded(JobSeeker js);
}

