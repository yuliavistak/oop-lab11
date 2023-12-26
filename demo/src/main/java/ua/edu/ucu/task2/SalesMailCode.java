package ua.edu.ucu.task2;

public class SalesMailCode implements MailCode {

    @Override
    public String generateText(Client client) {
        return "Hey, {{ NAME }}! You have -15% of discount this week".replaceAll("{{ NAME }}", client.getName());
    }
    
}