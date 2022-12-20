package pro.sky.java.course2.homework3_4_spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.course2.homework3_4_spring.service.ProductBasketService;

import java.util.Collection;
import java.util.List;

@RestController
public class ProductBasketController {
    private final ProductBasketService productBasketService;

    public ProductBasketController(ProductBasketService productBasketService) {
        this.productBasketService = productBasketService;
    }

    @GetMapping("/order/add")
    public Collection<String> createProductBasket(@RequestParam(name = "productID") List<Integer> productID) {
        if (productID.contains(null) || productID.isEmpty()) {
            throw new IllegalArgumentException("ID продуктов должно быть числом");
        } else {
            return productBasketService.addProduct(productID);
        }
    }

    @GetMapping("/order/get")
    public Collection<Integer> getProductBasket() {
        return productBasketService.getAllProducts();
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
