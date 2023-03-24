package org.example.utils;

import javax.persistence.EntityManager;

public class TransactionManager {

    public static void doInTransaction(TransactionCallback callback) {
        EntityManager entityManager = DbConnector.getEntityManager();
        entityManager.getTransaction().begin();

        callback.doInTransaction(entityManager);

        entityManager.getTransaction().commit();
    }
}
