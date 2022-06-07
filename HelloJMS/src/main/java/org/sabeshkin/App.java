package org.sabeshkin;

import javax.jms.JMSException;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) throws Exception {
        final MessageSender sender = new MessageSender();
        final MessageReceiver receiver = new MessageReceiver();
        receiver.startListener();




        IntStream.rangeClosed(1,5).forEach(index -> {
            try {
                sender.sendMessage(index +" Hello world!");
                Thread.sleep(100);
            } catch (JMSException | InterruptedException e) {
                e.printStackTrace();
            }
        });
        sender.close();
        receiver.close();
    }
}
