package com.dentalclinic.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.dentalclinic.demo.entity.SignupEntity;

public interface SignupRepository extends CrudRepository<SignupEntity, Long>{

}
