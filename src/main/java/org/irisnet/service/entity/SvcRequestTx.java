package org.irisnet.service.entity;

import org.web3j.abi.datatypes.generated.Uint64;

public class SvcRequestTx extends BaseTx {

    String ServiceName;
    String bindChainId;
    String defChainId;
    String methodId;
    String provider;
    String consumer;
    String serviceFee;
    String data;
    boolean profiling;


    public SvcRequestTx(String name, String password, String chainId, Uint64 accountNumber, Uint64 sequence, String gas, String gasAdjustment, String fee, String serviceName, String bindChainId, String defChainId, String methodId, String provider, String consumer, String serviceFee, String data, boolean profiling) {
        super(name, password, chainId, accountNumber, sequence, gas, gasAdjustment, fee);
        ServiceName = serviceName;
        this.bindChainId = bindChainId;
        this.defChainId = defChainId;
        this.methodId = methodId;
        this.provider = provider;
        this.consumer = consumer;
        this.serviceFee = serviceFee;
        this.data = data;
        this.profiling = profiling;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
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

    public boolean isProfiling() {
        return profiling;
    }

    public void setProfiling(boolean profiling) {
        this.profiling = profiling;
    }
}
