package ma.iaad.stdapp;

import ma.iaad.stdapp.entities.Product;
import ma.iaad.stdapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StdappApplication implements CommandLineRunner {
@Autowired
private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(StdappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    productRepository.save(new Product(null,"computer",4300,3));
		productRepository.save(new Product(null,"smartphone",4300,5));
		productRepository.save(new Product(null,"TV",4300,39));
		List<Product> products = productRepository.findAll();
		products.forEach(p->{
			System.out.println(p.toString());
		});
		Product product=productRepository.findById(Long.valueOf(1)).get();
		System.out.println("***********");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println("-----------------------------------------------------");

		List<Product> productList = productRepository.findByNameContains("C");
		productList.forEach(p->{
			System.out.println(p);
		});
		System.out.println("----------------------");
		List<Product> productList2 = productRepository.search("%C%");
		productList2.forEach(p->{
			System.out.println(p);
		});
		System.out.println("----------------------");
		List<Product> productList3 = productRepository.findByPriceGreaterThan(300);
		productList3.forEach(p->{
			System.out.println(p);
		});
		System.out.println("----------------------");
		List<Product> productList4 = productRepository.searchByPrice(300);
		productList4.forEach(p->{
			System.out.println(p);
		});





	}
}
