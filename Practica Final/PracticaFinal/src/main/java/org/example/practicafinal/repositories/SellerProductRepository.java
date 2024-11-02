package org.example.practicafinal.repositories;

import org.example.practicafinal.entities.Category;
import org.example.practicafinal.entities.Product;
import org.example.practicafinal.entities.Seller;
import org.example.practicafinal.entities.SellerProduct;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SellerProductRepository {

    public boolean addToStore(Category category, Product product, Integer stock, Seller seller) throws Exception {
        boolean insertCorrect = false;

        try(Session session = DbUtils.openSession()){
            Transaction transaction = session.beginTransaction();
            SellerProduct sellerProduct = new SellerProduct();
            product.setCategory(category);
            sellerProduct.setProduct(product);
            sellerProduct.setStock(stock);
            sellerProduct.setSeller(seller);

            session.persist(sellerProduct);
            transaction.commit();
            insertCorrect = true;
        } catch (Exception e) {
            throw new Exception(e);
        }
        return insertCorrect;
    }

    public boolean makeDiscount(Product product, LocalDate offerStartDate,
                                LocalDate offerEndDate, BigDecimal offerPrice) throws Exception {

        boolean discountCorrect = false;

        try(Session session = DbUtils.openSession()){
            Transaction transaction = session.beginTransaction();
            if (hasProductDiscount(product)){
                return false;
            }

            SellerProduct sellerProduct = new SellerProduct();
            sellerProduct.setProduct(product);
            sellerProduct.setOfferStartDate(offerStartDate);
            sellerProduct.setOfferEndDate(offerEndDate);
            sellerProduct.setOfferPrice(offerPrice);

            session.persist(sellerProduct);
            transaction.commit();
            discountCorrect = true;
        } catch (Exception e) {
            throw new Exception(e);
        }
        return discountCorrect;
    }

    public boolean hasProductDiscount(Product product){
        SellerProduct sellerProduct = null;
        try(Session session = DbUtils.openSession()){

            Query<SellerProduct> query = session.createQuery(
                    "from org.example.practicafinal.entities.SellerProduct", SellerProduct.class);
            query.setParameter("product", product);
            sellerProduct = query.getSingleResult();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return sellerProduct != null;
    }
}
