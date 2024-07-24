package com.example.investingapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class AccountStockId {

    @Column(name = "account_id")
    private UUID accountId;

    @Column(name = "stock_id")
    private String stockId;

    public AccountStockId() {
    }

    public AccountStockId(UUID accountId, String stokcId) {
        this.accountId = accountId;
        this.stockId = stokcId;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public String getStokcId() {
        return stockId;
    }

    public void setStokcId(String stokcId) {
        this.stockId = stokcId;
    }
}
