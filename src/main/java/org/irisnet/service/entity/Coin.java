package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coin {
    @JsonProperty("denom")
    String denom;
    @JsonProperty("amount")
    String amount;
}
