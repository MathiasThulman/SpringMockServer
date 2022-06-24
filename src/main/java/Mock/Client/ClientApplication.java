package Mock.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
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
		List<Integer> prices = List.of(300,400,900,110,20,400);
		client.sendToCurrencyService(1250, "cow");
		client.sendToCurrencyService(1555, "donkey");
		client.sendToCurrencyService(70,"silver");
		client.sendToCurrencyService(60, "gold");
		client.sendToPriceServince(prices);

//		while(true) {
//			Scanner scanner = new Scanner(System.in);
//			int reqAmount = scanner.nextInt();
//			String reqCurrency = scanner.nextLine();
//			client.sendToCurrencyService(reqAmount, reqCurrency);
//		}


	}

}
