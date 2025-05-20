package com.example.spring_learning;

import com.example.spring_learning.business.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App08 {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        } catch (Exception e) {

        }
    }
}
