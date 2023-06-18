package com.example.wfrphelper.repository;

import com.example.wfrphelper.model.mainClasses.Master;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MasterRepository {


    @PersistenceContext
    private EntityManager entityManager;

    public List<Master> getAll() {
        return entityManager.createQuery("from Country c order by c.id desc", Master.class).getResultList();
    }

    public Master getById(int id) {
        return entityManager.find(Master.class, id);
    }
}

