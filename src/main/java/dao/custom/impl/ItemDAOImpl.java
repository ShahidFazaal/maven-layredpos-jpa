package dao.custom.impl;

import dao.CrudDAOImpl;
import dao.custom.ItemDAO;
import entity.Item;
import org.hibernate.Session;

import javax.persistence.NoResultException;
import java.util.List;

public class ItemDAOImpl extends CrudDAOImpl<Item,String> implements ItemDAO {



    @Override
    public String getLastItemCode() throws Exception {
        try {
            List resultList = entityManager.createQuery("SELECT i.code FROM entity.Item i ORDER BY i.code DESC").setMaxResults(1).getResultList();
            return (resultList.size()>0? (String) resultList.get(0) :null);
        } catch (NoResultException e) {
            return null;
        }

    }

}
