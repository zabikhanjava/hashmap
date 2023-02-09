package com.valtech.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwttokenApplication {

	public static  void main(String[] args) {
		SpringApplication.run(JwttokenApplication.class, args);
	//	extracted();
	}

	/*private static <Product> void extracted() {
		Product product = Product.builder()
				.category("grocery")
				.id("Sre4423")
				.price(32f)
				.build();
		Product product1 = Product.builder()
				.category("sanitery")
				.id("Sre4423")
				.price(43f)
				.build();
		Product product2 = Product.builder()
				.category("constructtion")
				.id("Sre4423")
				.price(54f)
				.build();

		List<Product> listProducts = new ArrayList();
		listProducts.add(product);
		listProducts.add(product1);
		listProducts.add(product2);

		List<Product> s = listProducts.stream().filter(x -> x.getCategory().equals("grocery")).map(x ->

		{

			float price=x.getPrice();
			float perce = price/100*15;
			x.setPrice(price+perce);
			return x;
		}).collect(Collectors.toList());

		System.out.println(s.get(0).price);
	}
*/

}