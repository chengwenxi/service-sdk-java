package org.irisnet.service.entity;

import org.web3j.abi.datatypes.generated.Uint64;

public class BaseTx {
    String name;
    String password;
    String chainId;
    Uint64 accountNumber;
    Uint64 sequence;
    String gas;
    String gasAdjustment;
    String fee;

    public BaseTx(String name, String password, String chainId, Uint64 accountNumber, Uint64 sequence, String gas, String gasAdjustment, String fee) {
        this.name = name;
        this.password = password;
        this.chainId = chainId;
        this.accountNumber = accountNumber;
        this.sequence = sequence;
        this.gas = gas;
        this.gasAdjustment = gasAdjustment;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public Uint64 getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Uint64 accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Uint64 getSequence() {
        return sequence;
    }

    public void setSequence(Uint64 sequence) {
        this.sequence = sequence;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getGasAdjustment() {
        return gasAdjustment;
    }

    public void setGasAdjustment(String gasAdjustment) {
        this.gasAdjustment = gasAdjustment;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
}