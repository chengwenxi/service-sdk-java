package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.web3j.abi.datatypes.generated.Int16;
import org.web3j.abi.datatypes.generated.Int64;

public class SvcRequest {
    @JsonProperty("def_chain_id")
    String defChainID;
    @JsonProperty("def_name")
    String defName;
    @JsonProperty("bind_chain_id")
    String bindChainId;
    @JsonProperty("req_chain_id")
    String reqChainId;
    @JsonProperty("method_id")
    String methodId;
    @JsonProperty("provider")
    String provider;
    @JsonProperty("consumer")
    String consumer;
    @JsonProperty("service_fee")
    Coin[] serviceFee;
    @JsonProperty("input")
    byte[] input;
    @JsonProperty("profiling")
    boolean profiling;
    @JsonProperty("request_height")
    String requestHeight;
    @JsonProperty("request_intra_tx_counter")
    Int16 requestIntraTxCounter;
    @JsonProperty("expiration_height")
    String expirationHeight;
}

