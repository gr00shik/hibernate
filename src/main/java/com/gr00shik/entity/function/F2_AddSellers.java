package com.gr00shik.entity.function;

import com.gr00shik.entity.store.Seller;
import com.gr00shik.entity.store.Shop;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class F2_AddSellers {

    public static void addSellers(Session session){

        session.beginTransaction();

        List<Seller> sellerList = Arrays.asList(
                new Seller("Maksim", "Utkin", new Shop(1)),
                new Seller("Oleg", "Sidorov", new Shop(1)),
                new Seller("Natalia", "Samoilava", new Shop(2)),
                new Seller("Olya", "Makarova", new Shop(2)),
                new Seller("Sergey", "Makarov", new Shop(2)),
                new Seller("Andrey", "Petrov", new Shop(3)),
                new Seller("Maksim", "Serduc", new Shop(3)),
                new Seller("Egor", "Krapiva", new Shop(4)),
                new Seller("Nikita", "Yankevich", new Shop(5)),
                new Seller("Marina", "Dubova", new Shop(5)),
                new Seller("Ekaterina", "Riskova", new Shop(5)),
                new Seller("Sergey", "Pavlov", new Shop(6)),
                new Seller("Nikolay", "Blinov", new Shop(6)),
                new Seller("Igor", "Rechica", new Shop(7)),
                new Seller("Elena", "Bir", new Shop(7)),
                new Seller("Olya", "Samoilova", new Shop(7))
        );

        for(Seller seller : sellerList){
            session.save(seller);
        }

        session.getTransaction().commit();
    }
}
