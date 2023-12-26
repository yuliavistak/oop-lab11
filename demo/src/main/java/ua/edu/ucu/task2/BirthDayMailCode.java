package ua.edu.ucu.task2;

public class BirthDayMailCode implements MailCode {

    @Override
    public String generateText(Client client) {
        return "Happy Birthday, {{ NAME }}".replaceAll("{{ NAME }}", client.getName());
    }
    
}
