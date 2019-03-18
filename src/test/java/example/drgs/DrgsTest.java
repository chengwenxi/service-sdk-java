package example.drgs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bouncycastle.util.encoders.Hex;
import org.irisnet.service.Config;
import org.irisnet.service.chain.Send;
import org.irisnet.service.entity.*;
import org.irisnet.service.utils.HttpUtil;
import org.junit.Test;
import org.web3j.abi.datatypes.generated.Uint64;

import java.io.IOException;
import java.util.List;

import static org.irisnet.service.chain.Query.GetAccount;

public class DrgsTest {


    static String drgsAddr = "faa1ysj7akyqnadqllueke0xhrftngxehq8m69dp9t";
    static String hospitalAddr = "faa1ysj7akyqnadqllueke0xhrftngxehq8m69dp9t";
    static String chainId = "test";
    static String serviceName = "test";
    static String methodId = "1";
    static Boolean profiling = false;

    static String name = "node0";
    static String name1 = "node1";
    static String password = "1234567890";
    static String fee = "1iris";


    @Test
    public void drgs() throws IOException, InterruptedException {

        Invocate invocate = new DrgsInvocate();

        while (true) {
            Thread.sleep(5000);
            String jsonstr = HttpUtil.HttpGet(Config.LCDURL + "/service/requests/" + chainId + "/" + serviceName + "/" + chainId + "/" + drgsAddr);
            if (jsonstr == null) {
                continue;
            }
            ObjectMapper mapper = new ObjectMapper();
            List<SvcRequest> requests = mapper.readValue(jsonstr, new TypeReference<List<SvcRequest>>() {
            });
            requests.forEach(request -> {
                try {
                    invocate.process(drgsAddr, request);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

    }


    @Test
    public void hospital() throws IOException {
        Account account = GetAccount(hospitalAddr);
        BaseTx baseTx = new BaseTx().BaseTxDefault(account.getAccountNumber(), account.getSequence() + 1);

        Drgs.DrgsRequest.Builder requestBuilder = Drgs.DrgsRequest.newBuilder();
        requestBuilder.setMainDiagnosisCode("12");
        requestBuilder.setMainDiagnosisName("34");
        String input = Hex.toHexString(requestBuilder.build().toByteArray());
        RequestTx request = new RequestTx(serviceName, chainId, chainId, methodId, drgsAddr, hospitalAddr, "1iris", input);
        RequestTx[] requests = {request};
        SvcRequestTx svcRequestTx = new SvcRequestTx(baseTx, requests);

        Send.Call(svcRequestTx);
    }

}
