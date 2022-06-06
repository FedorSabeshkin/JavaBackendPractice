package org.sabeshkin;

import javax.jms.*;


public class MessageReceiver implements MessageListener, AutoCloseable {

    private Connection connection;
    private MessageConsumer consumer;

    public MessageReceiver() throws JMSException {
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
        try {
            System.out.println(message.getStringProperty("text"));
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    public void close() throws JMSException {
        connection.close();
    }
}
