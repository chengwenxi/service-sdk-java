package org.irisnet.service.entity;

public class SvcResponseTx {
    BaseTx baseTx;
    ResponseTx response;


    public SvcResponseTx() {
    }

    public SvcResponseTx(BaseTx baseTx, ResponseTx response) {
        this.baseTx = baseTx;
        this.response = response;
    }

    public BaseTx getBaseTx() {
        return baseTx;
    }

    public void setBaseTx(BaseTx baseTx) {
        this.baseTx = baseTx;
    }

    public ResponseTx getResponse() {
        return response;
    }

    public void setResponse(ResponseTx response) {
        this.response = response;
    }
}
