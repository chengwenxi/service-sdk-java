package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
    @JsonProperty("account_number")
    String accountNumber;
    @JsonProperty("address")
    String address;
    @JsonProperty("coins")
    Coin[] coins;
    @JsonProperty("public_key")
    String publicKey;
    @JsonProperty("sequence")
    String sequence;
}
