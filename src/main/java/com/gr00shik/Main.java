package com.gr00shik;

import com.gr00shik.entity.function.F1_AddShops;
import com.gr00shik.entity.function.F2_AddSellers;
import com.gr00shik.entity.function.F3_AddProducts;
import com.gr00shik.entity.function.F4_AddDeals;
import com.gr00shik.entity.report.MakeReportAboutDeals;
import com.gr00shik.entity.report.MakeReportAboutShopAndSeller;
import com.gr00shik.entity.report.object.ReportDeal;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
// Test
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();

        //Only one execute for a create data in database for testing

//        F1_AddShops.addShops(session);
//        F2_AddSellers.addSellers(session);
//        F3_AddProducts.addProducts(session);
//        F4_AddDeals.addDeals(session);


    //Make Report about all deals with Seller and ProductName
        List<ReportDeal> reportDeals = MakeReportAboutDeals.getReportDeal(session);
        for(ReportDeal deal : reportDeals){
            System.out.println(deal);
        }
    //Make Report about all shops and sellers
        MakeReportAboutShopAndSeller.getShops(session);

    //Add a deal in database

//        try {
//            AddDeal.addDeal(session, 1, new Deal(new Product(1), new Seller(2), new Date(2018-1900, 5-1, 6-1)));
//        } catch (NoAnyProductException e) {
//            e.printStackTrace();
//        }

        session.close();
        ourSessionFactory.close();

    }
}