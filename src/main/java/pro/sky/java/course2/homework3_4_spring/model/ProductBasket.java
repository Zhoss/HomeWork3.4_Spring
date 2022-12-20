package pro.sky.java.course2.homework3_4_spring.model;


import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@Repository
@SessionScope
public class ProductBasket {
    private final Set<Integer> productBasket = new HashSet<>();

    public Set<Integer> getProductBasket() {
        return productBasket;
    }
}
