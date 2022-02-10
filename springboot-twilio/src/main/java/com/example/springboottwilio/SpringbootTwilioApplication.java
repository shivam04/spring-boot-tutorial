package com.example.springboottwilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTwilioApplication implements ApplicationRunner {
    private final static String ACCOUNT_SID = "*************";
    private final static String AUTH_ID = "***************";

    static {
        Twilio.init(ACCOUNT_SID, AUTH_ID);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTwilioApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        Message.creator(new PhoneNumber("+917905359633"), new PhoneNumber("********"),
                "Message from Spring Boot Application").create();
    }
}
