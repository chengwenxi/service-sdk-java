package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseTx {
    @JsonProperty("req_chain_id")
    String reqChainId;
    @JsonProperty("request_id")
    String requestId;
    @JsonProperty("data")
    String data;
    @JsonProperty("provider")
    String provider;
    @JsonProperty("error_msg")
    String errorMsg;

    public ResponseTx() {

    }

    public ResponseTx(String reqChainId, String requestId, String data, String provider, String errorMsg) {
        this.reqChainId = reqChainId;
        this.requestId = requestId;
        this.data = data;
        this.provider = provider;
        this.errorMsg = errorMsg;
    }

    public String getReqChainId() {
        return reqChainId;
    }

    public void setReqChainId(String reqChainId) {
        this.reqChainId = reqChainId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
