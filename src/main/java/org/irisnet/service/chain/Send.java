package org.irisnet.service.chain;

import org.irisnet.service.Config;
import org.irisnet.service.entity.*;
import org.irisnet.service.utils.HttpUtil;
import org.web3j.abi.datatypes.generated.Uint64;

import java.io.IOException;

import static org.irisnet.service.chain.Query.GetAccount;

public class Send {


    public static String Call(SvcRequestTx tx) throws IOException {
        return HttpUtil.HttpPost(Config.LCDURL + "/service/request", tx);
    }

    public static String Respond(String address, SvcRequest request, String data) throws IOException {
        String requestId = Util.getRequestId(request);
        ResponseTx response = new ResponseTx(request.getReqChainId(), requestId, data, request.getProvider(), "");

        Account account = GetAccount(address);
        BaseTx baseTx = new BaseTx().BaseTxDefault(account.getAccountNumber(), account.getSequence() + 1);

        SvcResponseTx tx = new SvcResponseTx(baseTx, response);
        return HttpUtil.HttpPost(Config.LCDURL + "/service/response", tx);
    }
}
