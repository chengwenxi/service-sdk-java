package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SvcRequestTx {
    @JsonProperty("base_tx")
    BaseTx baseTx;
    RequestTx[] requests;

    public SvcRequestTx() {
    }

    public SvcRequestTx(BaseTx baseTx, RequestTx[] requests) {
        this.baseTx = baseTx;
        this.requests = requests;
    }

    public BaseTx getBaseTx() {
        return baseTx;
    }

    public void setBaseTx(BaseTx baseTx) {
        this.baseTx = baseTx;
    }

    public RequestTx[] getRequests() {
        return requests;
    }

    public void setRequests(RequestTx[] requests) {
        this.requests = requests;
    }
}
