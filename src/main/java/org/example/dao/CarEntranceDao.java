package org.example.dao;

import org.example.model.CarEntrance;
import org.example.utils.TransactionManager;

public class CarEntranceDao {
    public void create(CarEntrance carEntrance){
        TransactionManager.doInTransaction(entityManager -> entityManager.persist(carEntrance));
    }
}
