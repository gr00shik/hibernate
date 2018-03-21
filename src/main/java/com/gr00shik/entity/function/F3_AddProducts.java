package com.gr00shik.entity.function;

import com.gr00shik.entity.store.Product;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class F3_AddProducts {

    public static void addProducts(Session session){

        session.beginTransaction();

        List<Product> productList = Arrays.asList(
                new Product("Iphone 6S", 10, 1800L, "Apple Corporation"),
                new Product("Samsung S8", 10, 1700L, "Samsung Corporation"),
                new Product("Huawei Mate 10", 10, 1900L, "Huawei Corporation"),
                new Product("Lg 6P", 10, 1200L, "LG Corporation"),
                new Product("Meizu 6Pro", 10, 900L, "Meizu Corporation"),
                new Product("Xiaomi 6Mi", 10, 1100L, "Xiaomi Corporation")
        );

        for(Product product : productList){
            session.save(product);
        }

        session.getTransaction().commit();





    }

}
