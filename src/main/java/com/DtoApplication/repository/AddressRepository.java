package com.DtoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DtoApplication.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
