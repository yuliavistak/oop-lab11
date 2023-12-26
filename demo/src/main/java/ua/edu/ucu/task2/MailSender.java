package ua.edu.ucu.task2;


import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;

import lombok.SneakyThrows;

import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    @SneakyThrows
    public static void sendMessage(MailInfo email) {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient(System.getenv("insert-your-API-KEY"), System.getenv("insert-your-API-SECRET"), new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "vistak.pn@ucu.edu.ua")
                                        .put("Name", "Yuliia"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                            .put("Email", email.getClient().getEmail())
                                            .put("Name", email.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, "Greetings from Yuliia.")
                                .put(Emailv31.Message.TEXTPART, email.getCode().generateText(email.getClient()))));
        response = client.post(request);

        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
