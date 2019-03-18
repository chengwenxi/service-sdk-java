package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.irisnet.service.Config;

public class BaseTx {
    String name;
    String password;
    @JsonProperty("chain_id")
    String chainId;
    @JsonProperty("account_number")
    String accountNumber;
    int sequence;
    String gas;
    @JsonProperty("gas_adjustment")
    String gasAdjustment;
    String fee;

    public BaseTx() {
    }

    public BaseTx(String name, String password, String chainId, String accountNumber, int sequence, String gas, String gasAdjustment, String fee) {
        this.name = name;
        this.password = password;
        this.chainId = chainId;
        this.accountNumber = accountNumber;
        this.sequence = sequence;
        this.gas = gas;
        this.gasAdjustment = gasAdjustment;
        this.fee = fee;
    }

    public BaseTx BaseTxDefault(String accountNumber, int sequence) {
        return new BaseTx(Config.NAME, Config.PASSWORD, Config.CHAINID, accountNumber, sequence,
                Config.GAS, Config.GASADJUSTMENT, Config.FEE);
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
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