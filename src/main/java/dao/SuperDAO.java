package dao;

import entity.Item;
import entity.SuperEntity;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface SuperDAO <T extends SuperEntity,ID extends Serializable>{
    public void setEntityManager(EntityManager entityManager);

}
