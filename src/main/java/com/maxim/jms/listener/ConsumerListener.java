package com.maxim.jms.listener;


import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;

@Component
public class ConsumerListener implements MessageListener {


    public void onMessage(Message message) {
        System.out.println("In onMessage");
    }
}
