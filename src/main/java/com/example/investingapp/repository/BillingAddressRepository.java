package com.example.investingapp.repository;

import com.example.investingapp.entity.BillingAddress;
import com.example.investingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BillingAddressRepository extends JpaRepository<BillingAddress, UUID> {

}
