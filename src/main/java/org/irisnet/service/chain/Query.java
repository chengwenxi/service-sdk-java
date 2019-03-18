package org.irisnet.service.chain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.irisnet.service.entity.Account;
import org.irisnet.service.utils.HttpUtil;

import org.irisnet.service.Config;

import java.io.IOException;

public class Query {

    public static Account GetAccount(String address) throws IOException {
        String jsonstr = HttpUtil.HttpGet(Config.LCDURL + "/auth/accounts/" + address);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonstr, Account.class);
    }
}
