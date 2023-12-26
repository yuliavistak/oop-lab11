package ua.edu.ucu.task2;

import lombok.SneakyThrows;


public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Client Olha = new Client("Yuliia", "vistak.pn@ucu.edu.ua", 18, Gender.FEMALE);

        MailInfo message = new MailInfo(Olha, new NewsMailCode());

        MailBox box = new MailBox();

        box.addMailInfo(message);
        box.sendAll();

    }
}