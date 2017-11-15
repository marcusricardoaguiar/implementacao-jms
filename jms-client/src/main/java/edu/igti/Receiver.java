package edu.igti;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "faturamento")
    public void receiveMessage(Faturamento faturamento) {
        System.out.println("APP Client: Received <" + faturamento + ">");
    }

}
