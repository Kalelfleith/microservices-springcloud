package one.digitalinovationone.experts.productcatalog.controller;

import one.digitalinovationone.experts.productcatalog.model.Product;
import one.digitalinovationone.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(method = RequestMethod.POST)
	Product create(@RequestBody Product product) {
		return productRepository.save(product);
	}
}
