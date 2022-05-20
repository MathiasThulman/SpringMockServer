package Mock.Client;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MockClient {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private DirectExchange directExchange;

    public void send(String request) {
        float response = (float) rabbitTemplate.convertSendAndReceive(directExchange.getName(), "knightly", request);
        System.out.println("Got " + response + "");
    }

}
