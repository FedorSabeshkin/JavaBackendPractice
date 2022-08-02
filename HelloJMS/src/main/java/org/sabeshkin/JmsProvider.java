package org.sabeshkin;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.ConnectionFactory;

public class JmsProvider {

    public static ConnectionFactory getConnectionFactory() {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnection.DEFAULT_BROKER_URL);

        return connectionFactory;
    }
}