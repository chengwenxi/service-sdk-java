package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestTx {
    @JsonProperty("service_name")
    String serviceName;
    @JsonProperty("bind_chain_id")
    String bindChainId;
    @JsonProperty("def_chain_id")
    String defChainId;
    @JsonProperty("method_id")
    String methodId;
    String provider;
    String consumer;
    @JsonProperty("service_fee")
    String serviceFee;
    String data;

    public RequestTx() {

    }

    public RequestTx(String serviceName, String bindChainId, String defChainId, String methodId, String provider, String consumer, String serviceFee, String data) {
        this.serviceName = serviceName;
        this.bindChainId = bindChainId;
        this.defChainId = defChainId;
        this.methodId = methodId;
        this.provider = provider;
        this.consumer = consumer;
        this.serviceFee = serviceFee;
        this.data = data;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getBindChainId() {
        return bindChainId;
    }

    public void setBindChainId(String bindChainId) {
        this.bindChainId = bindChainId;
    }

    public String getDefChainId() {
        return defChainId;
    }

    public void setDefChainId(String defChainId) {
        this.defChainId = defChainId;
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

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
