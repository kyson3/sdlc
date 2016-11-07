package com.maxim.jms.listener;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.jms.TextMessage;

import static org.junit.Assert.*;


public class ConsumerListenerTest {

    private TextMessage message;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testOnMessage() throws Exception {
        ConsumerListener consumerListener = new ConsumerListener();
        consumerListener.onMessage(message);
        assertNull(message);
    }

}