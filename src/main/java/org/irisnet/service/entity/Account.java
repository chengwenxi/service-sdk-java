package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
    @JsonProperty("account_number")
    String accountNumber;
    @JsonProperty("address")
    String address;
    @JsonProperty("coins")
    String[] coins;
    @JsonProperty("public_key")
    BaseEntity<String> publicKey;
    @JsonProperty("sequence")
    int sequence;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getCoins() {
        return coins;
    }

    public void setCoins(String[] coins) {
        this.coins = coins;
    }

    public BaseEntity<String> getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(BaseEntity<String> publicKey) {
        this.publicKey = publicKey;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
