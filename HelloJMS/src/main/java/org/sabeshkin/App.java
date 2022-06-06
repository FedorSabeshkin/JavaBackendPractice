package org.sabeshkin;

import javax.jms.JMSException;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) throws Exception {
        MessageReceiver receiver = new MessageReceiver();
        MessageSender sender = new MessageSender();
        IntStream.rangeClosed(1,5).forEach(index -> {
            try {
                sender.sendMessage(index +" Message");
            } catch (JMSException e) {
                e.printStackTrace();
            }
        });
    }
}
