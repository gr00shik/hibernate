package com.gr00shik.entity.function;

import com.gr00shik.entity.store.Deal;
import com.gr00shik.entity.store.Product;
import com.gr00shik.entity.store.Seller;
import org.hibernate.Session;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

public class F4_AddDeals {

    public static void addDeals(Session session){

        session.beginTransaction();

        List<Deal> dealList = Arrays.asList(
                new Deal(new Product(1), new Seller(1), new Date(2018-1900, 2-1, 5-1)),
                new Deal(new Product(2), new Seller(2), new Date(2018-1900, 3-1, 12-1)),
                new Deal(new Product(3), new Seller(3), new Date(2018-1900, 3-1, 14-1)),
                new Deal(new Product(2), new Seller(5), new Date(2018-1900, 4-1, 20-1)),
                new Deal(new Product(3), new Seller(5), new Date(2018-1900, 5-1, 2-1)),
                new Deal(new Product(4), new Seller(1), new Date(2018-1900, 1-1, 9-1))
        );

        for (Deal deal: dealList){
            session.save(deal);
        }

        session.getTransaction().commit();


    }

}
