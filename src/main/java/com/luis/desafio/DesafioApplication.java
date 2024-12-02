package com.luis.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luis.desafio.entities.Order;
import com.luis.desafio.services.OrderService;
import com.luis.desafio.services.ShippingService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;
	@Autowired 
	private ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		
		System.out.println("Pedido código: " + order.getCode());

		double finalValue = orderService.total(order) + shippingService.shipment(order);

		System.out.printf("Valor total: R$ %.2f%n", finalValue);

	}

}
