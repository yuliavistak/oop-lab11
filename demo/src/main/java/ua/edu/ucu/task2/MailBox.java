package ua.edu.ucu.task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos; //(the place where all the information to be sent should be stored);
    
    public void addMailInfo(MailInfo mail) {
        infos.add(mail);
        Collections.sort(infos, new MailInfoComparator());
    }

    public void sendAll() {
        while(!infos.isEmpty()) {
            // send
            remove();
        }
    }

    public void remove() {
        if(infos.isEmpty()) {
            System.out.println("Mail Box is already empty!");
        }
        infos.remove(0);
    }
    


}

class MailInfoComparator implements Comparator<MailInfo> {
    @Override
    public int compare(MailInfo a, MailInfo b) {
        return a.getClient().getName().compareTo(b.getClient().getName());
    }
}