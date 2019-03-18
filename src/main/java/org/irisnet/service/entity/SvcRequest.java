package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.web3j.abi.datatypes.generated.Int16;

public class SvcRequest {
    @JsonProperty("def_chain_id")
    String defChainId;
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
    @JsonProperty("request_height")
    String requestHeight;
    @JsonProperty("request_intra_tx_counter")
    Int16 requestIntraTxCounter;
    @JsonProperty("expiration_height")
    String expirationHeight;

    public String getDefChainId() {
        return defChainId;
    }

    public void setDefChainId(String defChainId) {
        this.defChainId = defChainId;
    }

    public String getDefName() {
        return defName;
    }

    public void setDefName(String defName) {
        this.defName = defName;
    }

    public String getBindChainId() {
        return bindChainId;
    }

    public void setBindChainId(String bindChainId) {
        this.bindChainId = bindChainId;
    }

    public String getReqChainId() {
        return reqChainId;
    }

    public void setReqChainId(String reqChainId) {
        this.reqChainId = reqChainId;
    }

    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public Coin[] getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(Coin[] serviceFee) {
        this.serviceFee = serviceFee;
    }

    public byte[] getInput() {
        return input;
    }

    public void setInput(byte[] input) {
        this.input = input;
    }

    public String getRequestHeight() {
        return requestHeight;
    }

    public void setRequestHeight(String requestHeight) {
        this.requestHeight = requestHeight;
    }

    public Int16 getRequestIntraTxCounter() {
        return requestIntraTxCounter;
    }

    public void setRequestIntraTxCounter(Int16 requestIntraTxCounter) {
        this.requestIntraTxCounter = requestIntraTxCounter;
    }

    public String getExpirationHeight() {
        return expirationHeight;
    }

    public void setExpirationHeight(String expirationHeight) {
        this.expirationHeight = expirationHeight;
    }
}

