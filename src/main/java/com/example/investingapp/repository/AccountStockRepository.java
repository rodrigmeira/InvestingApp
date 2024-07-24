package com.example.investingapp.repository;

import com.example.investingapp.entity.AccountStock;
import com.example.investingapp.entity.AccountStockId;
import com.example.investingapp.entity.AccountStockId;
import com.example.investingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountStockRepository extends JpaRepository<AccountStock, AccountStockId> {

}
