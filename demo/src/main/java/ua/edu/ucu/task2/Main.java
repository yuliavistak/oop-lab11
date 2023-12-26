package ua.edu.ucu.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    // private static final String API_SECRET =  "db5d610c3daa12bb2c4933db6b2df40f";
    // private static final String API_KEY = "14224ce4e9c5e11f8fc126e5081a572c";

    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {

        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}