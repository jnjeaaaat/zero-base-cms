package com.zerobase.cms.user.client.service;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.client.mailgun.SendMailForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    void emailTest() {

        SendMailForm form =
                SendMailForm.builder()
                        .from("zerobase-cms-test@test.com")
                        .to("ekswn120@gmail.com")
                        .subject("This is test mailgun service")
                        .text("my text")
                        .build();

        String result = mailgunClient.sendEmail(form);
        assertNotNull(result);
    }


}