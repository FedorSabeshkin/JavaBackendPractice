package org.sabeshkin;

import javax.jms.*;


public class MessageReceiver implements MessageListener {

    private Connection connection;
    private MessageConsumer consumer;

    public void startListener() throws JMSException {
        ConnectionFactory connectionFactory = JmsProvider.getConnectionFactory();
        this.connection = connectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("service.messages");
        consumer = session.createConsumer(queue);
        consumer.setMessageListener(this);
    }


    @Override
    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            TextMessage tm = (TextMessage) message;
            try {
                System.out.printf("Receive message: %s%n",
                        tm.getText());
                System.out.printf("Receive thread: %s%n",
                        Thread.currentThread().getName());
            } catch (JMSException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void close() throws JMSException {
        connection.close();
    }
}
