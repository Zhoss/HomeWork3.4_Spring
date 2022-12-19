package pro.sky.java.course2.homework3_4_spring.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.homework3_4_spring.model.Product;
import pro.sky.java.course2.homework3_4_spring.service.ProductBasketService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@SessionScope
public class ProductBasketController {
    private final ProductBasketService productBasketService;

    public ProductBasketController(ProductBasketService productBasketService) {
        this.productBasketService = productBasketService;
    }

    @GetMapping("/store/order/add")
    public Collection<String> createProductBasket(@RequestParam(name = "productID") List<Integer> productID) {
        if (productID.contains(null) || productID.isEmpty()) {
            return new ArrayList<>(List.of("ID продуктов должно быть от 1 до 4"));
        } else {
            return productBasketService.addProduct(productID);
        }
    }

    @GetMapping("/store/order/get")
    public Collection<Product> getProductBasket() {
        return productBasketService.getAllProducts();
    }
}
