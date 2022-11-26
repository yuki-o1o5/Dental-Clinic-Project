package com.dentalclinic.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.dentalclinic.demo.entity.Signup;

public interface iSignupRepository extends CrudRepository<Signup, Long>{
  
}
