package com.springboot.crud.repositary;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.crud.entity.Studentdata;


public interface StudentdataRepository extends MongoRepository<Studentdata ,Integer>{


}
