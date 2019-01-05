package org.erp.gescom.repository;

import org.erp.gescom.domain.Depense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DepenseRepository extends MongoRepository<Depense, String>{

}