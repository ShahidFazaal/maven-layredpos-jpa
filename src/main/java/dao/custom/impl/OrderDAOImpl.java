package dao.custom.impl;

import dao.CrudDAOImpl;
import dao.custom.OrderDAO;
import entity.Order;
import org.hibernate.Session;

import javax.persistence.NoResultException;
import java.util.List;

public class OrderDAOImpl extends CrudDAOImpl<Order,String> implements OrderDAO {


    @Override
    public String getLastOrderId() throws Exception {
        try {
            List resultList = entityManager.createQuery("SELECT o.id FROM entity.Order o ORDER BY o.id DESC").setMaxResults(1).getResultList();
            return (resultList.size()>0? (String) resultList.get(0) :null);
        } catch (NoResultException e) {
            return null;
        }

    }

}
