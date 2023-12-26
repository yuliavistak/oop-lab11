package ua.edu.ucu.task2;

public class NewsMailCode implements MailCode {

    @Override
    public String generateText(Client client) {
        return "What interesting happened this week?";
    }
    
}