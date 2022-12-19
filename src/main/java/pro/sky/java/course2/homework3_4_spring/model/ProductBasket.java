package pro.sky.java.course2.homework3_4_spring.model;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

//@Repository
public class ProductBasket {
    private final Map<Integer, Product> productBasket = new HashMap<>();

    public Map<Integer, Product> getProductBasket() {
        return productBasket;
    }
}
