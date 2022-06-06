package org.sabeshkin;

import javax.jms.*;

public class MessageSender implements AutoCloseable {

    private Connection connection;
    private MessageProducer producer;
    private Session session;

    public MessageSender() throws JMSException {
        ConnectionFactory connectionFactory = JmsProvider.getConnectionFactory();
        this.connection = connectionFactory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("service.messages");
        this.producer = session.createProducer(queue);
    }

    public void sendMessage(String message) throws JMSException {
        System.out.println("Send message");
        TextMessage textMessage = session.createTextMessage(message);
        producer.send(textMessage);
    }

    public void close() throws JMSException {
        connection.close();
    }
}
