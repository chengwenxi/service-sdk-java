package example.drgs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.irisnet.service.chain.Query;
import org.irisnet.service.entity.Account;
import org.irisnet.service.entity.SvcRequest;
import org.irisnet.service.utils.HttpUtil;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DrgsTest {


    static String drgsAddr = "faa1ysj7akyqnadqllueke0xhrftngxehq8m69dp9t";
    static String hospitalAddr = "faa1ysj7akyqnadqllueke0xhrftngxehq8m69dp9t";
    static String chainId = "test";
    static String serviceName = "test";

    @Test
    public void drgs() throws IOException {

        Account account = Query.GetAccount("faa1ysj7akyqnadqllueke0xhrftngxehq8m69dp9t");
        System.out.println(account);

        String jsonstr = HttpUtil.HttpGet("http://localhost:1317/service/requests/");



    }


    @Test
    public void hospital() throws IOException, InterruptedException {
        while (true) {
            Thread.sleep(5000);
            String jsonstr = HttpUtil.HttpGet("http://localhost:1317/service/requests/" + chainId + "/" + serviceName + "/" + chainId + "/" + drgsAddr);
            if (jsonstr == null) {
                continue;
            }
            ObjectMapper mapper = new ObjectMapper();
            List<SvcRequest> requests = mapper.readValue(jsonstr, new TypeReference<List<SvcRequest>>() {
            });
            System.out.println(requests);
        }

    }

}
