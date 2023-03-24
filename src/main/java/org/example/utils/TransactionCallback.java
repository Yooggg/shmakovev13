package org.example.utils;

import javax.persistence.EntityManager;

public interface TransactionCallback {

    void doInTransaction(EntityManager entityManager);

}
