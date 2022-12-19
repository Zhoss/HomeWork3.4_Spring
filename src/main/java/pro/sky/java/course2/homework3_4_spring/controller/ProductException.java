package pro.sky.java.course2.homework3_4_spring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductException {
    @ExceptionHandler(IllegalArgumentException.class)
    public void handle(IllegalArgumentException e) {
        System.out.println("ID продуктов должно быть от 1 до 4");
    }
}
