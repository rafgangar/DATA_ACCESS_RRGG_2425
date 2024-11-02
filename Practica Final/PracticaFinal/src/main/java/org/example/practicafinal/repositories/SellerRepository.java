package org.example.practicafinal.repositories;

import org.example.practicafinal.entities.Seller;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class SellerRepository {

    public boolean updateSeller(Seller seller) throws Exception {
        boolean updateCorrect = false;
        try(Session session = DbUtils.openSession()) {
            Query<Seller> query = session.createQuery(
                    "from org.example.practicafinal.entities.Seller", Seller.class);
            query.setParameter("id", seller.getId());
            Seller sellerDb = query.getSingleResult();
            if (sellerDb != null) {
                session.beginTransaction();
                sellerDb.setName(seller.getName());
                sellerDb.setBusinessName(seller.getBusinessName());
                sellerDb.setPhone(seller.getPhone());
                sellerDb.setEmail(seller.getEmail());
                sellerDb.setPassword(seller.getPassword());

                session.merge(sellerDb);
                session.getTransaction().commit();

                updateCorrect = true;
            }

        } catch (Exception e) {
            throw new Exception(e);
        }
        return updateCorrect;
    }

    public boolean logging(String userName, String password) throws Exception {
        Seller user = null;
        try(Session session = DbUtils.openSession()) {
            Query<Seller> query = session.createQuery(
                    "from org.example.practicafinal.entities.Seller", Seller.class);
            query.setParameter("userName", userName);
            query.setParameter("plainPassword", password);
            user = query.getSingleResult();

        } catch (Exception e) {
            throw new Exception(e);
        }
        return user != null;
    }
}
