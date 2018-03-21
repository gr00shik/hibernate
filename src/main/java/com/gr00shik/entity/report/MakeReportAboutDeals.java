package com.gr00shik.entity.report;

import com.gr00shik.entity.report.object.ReportDeal;
import org.hibernate.Session;

import java.util.List;

public class MakeReportAboutDeals {

    public static List<ReportDeal> getReportDeal(Session session){
        return session.createQuery("select new com.gr00shik.entity.report.object.ReportDeal(d.idProduct.name, d.idProduct.price, d.seller.firstName, d.seller.secondName) from Deal d").getResultList();
    }

}
