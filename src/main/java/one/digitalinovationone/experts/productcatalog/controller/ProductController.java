package one.digitalinovationone.experts.productcatalog.controller;

import java.util.Optional;
import one.digitalinovationone.experts.productcatalog.model.Product;
import one.digitalinovationone.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(method = RequestMethod.POST)
	Product create(@RequestBody Product product) {
		return productRepository.save(product);
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	Optional<Product> findById(@PathVariable Integer id) {
		return productRepository.findById(id);
	}
}
