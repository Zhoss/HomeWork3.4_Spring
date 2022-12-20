package pro.sky.java.course2.homework3_4_spring.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework3_4_spring.model.ProductBasket;

import java.util.*;

@Service
public class ProductBasketService {
    private final ProductBasket productBasket;

    public ProductBasketService(ProductBasket productBasket) {
        this.productBasket = productBasket;
    }

    public Collection<String> addProduct(List<Integer> productID) {
        List<String> printedList = new ArrayList<>();
            for (Integer ID : productID) {
                productBasket.getProductBasket().add(ID);
                printedList.add("Продукт с ID " + ID + " добавлен в корзину");
            }
        return printedList;
    }

    public Collection<Integer> getAllProducts() {
        return productBasket.getProductBasket();
    }
}
