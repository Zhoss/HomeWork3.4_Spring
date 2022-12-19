package pro.sky.java.course2.homework3_4_spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.homework3_4_spring.model.Product;
import pro.sky.java.course2.homework3_4_spring.model.ProductBasket;

import java.util.*;

@Service
@SessionScope
public class ProductBasketService {
    private final Map<Integer, Product> productBasket = new HashMap<>();
//    private final ProductBasket productBasket;


//    public ProductBasketService(ProductBasket productBasket) {
//        this.productBasket = productBasket;
//    }

    public Collection<String> addProduct(List<Integer> productID) {
        List<String> printedList = new ArrayList<>();
            for (Integer ID : productID) {
                productBasket.put(ID, new Product(ID));
                printedList.add("Продукт с ID " + ID + " добавлен в корзину");
            }
        return printedList;
    }

    public Collection<Product> getAllProducts() {
        return productBasket.values();
    }
}
