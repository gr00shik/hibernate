package com.gr00shik.entity.function;

import com.gr00shik.entity.store.Shop;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class F1_AddShops {


    public static void addShops(Session session){

        session.beginTransaction();

        List<Shop> shopList = Arrays.asList(
                new Shop("Minsk", 1),
                new Shop("Minsk", 2),
                new Shop("Vitebsk", 1),
                new Shop("Brest", 1),
                new Shop("Brest", 2),
                new Shop("Mogilev", 1),
                new Shop("Polotsk", 1)
        );

        for(Shop shop : shopList) {
            session.save(shop);
        }
        session.getTransaction().commit();
    }
}
