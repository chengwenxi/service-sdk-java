package org.irisnet.service.chain;

import org.irisnet.service.entity.SvcRequest;

public class Util {

    public static String getRequestId(SvcRequest request) {
        return request.getExpirationHeight() + "-" + request.getRequestHeight() + "-" + request.getRequestIntraTxCounter();
    }
}
