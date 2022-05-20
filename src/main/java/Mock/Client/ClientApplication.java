package Mock.Client;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner {

	@Autowired
	private MockClient client;

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		client.send("1000,cow");
		client.send("400,donkey");
		client.send("10,silver");
		client.send("60,gold");

		while(true) {
			Scanner scanner = new Scanner(System.in);
			client.send(scanner.nextLine());
		}


	}

}
