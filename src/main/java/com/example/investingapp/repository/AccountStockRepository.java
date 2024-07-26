package com.example.investingapp.repository;

import com.example.investingapp.entity.AccountStock;
import com.example.investingapp.entity.AccountStockId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountStockRepository
        extends JpaRepository<AccountStock, AccountStockId> {
}

