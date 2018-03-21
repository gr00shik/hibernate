package com.gr00shik.entity.function;

import com.gr00shik.entity.function.exc.NoAnyProductException;
import com.gr00shik.entity.store.Deal;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.Date;

public class AddDeal {

    public static void addDeal(Session session, Integer idprod, Deal deal) throws NoAnyProductException {

        session.beginTransaction();

        Integer count = (Integer)session.createQuery("select pr.count from Product pr where pr.id=:idprod").setParameter("idprod", idprod).getSingleResult();
        if(count>0) {
            Query query = session.createQuery("update Product pr set pr.count = :count where pr.id=:idprog");
            query.setParameter("count", count - 1);
            query.setParameter("idprog", idprod);
            query.executeUpdate();
            session.save(deal);
            session.getTransaction().commit();
        }
        else {
            session.getTransaction().rollback();
            throw new NoAnyProductException();
        }
    }
}
