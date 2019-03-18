package example.drgs;

import com.google.protobuf.InvalidProtocolBufferException;
import org.bouncycastle.util.encoders.Hex;
import org.irisnet.service.chain.Send;
import org.irisnet.service.entity.SvcRequest;

import java.io.IOException;

public class DrgsInvocate implements Invocate {

    @Override
    public byte[] serialize() {
        Drgs.DrgsRequest.Builder requestBuilder = Drgs.DrgsRequest.newBuilder();
        requestBuilder.setMainDiagnosisCode("1234");
        return requestBuilder.build().toByteArray();
    }

    @Override
    public Drgs.DrgsRequest transfer(byte[] data) {
        Drgs.DrgsRequest request = null;
        try {
            request = Drgs.DrgsRequest.parseFrom(data);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        return request;
    }

    @Override
    public void process(String address, SvcRequest request) throws IOException {
        Drgs.DrgsRequest requestData = this.transfer(request.getInput());
        if (requestData == null) {
            return;
        }
        Drgs.DrgsResponse.Builder responseBuilder = Drgs.DrgsResponse.newBuilder();
        responseBuilder.setDrg("test");
        responseBuilder.setDrgName("test");
        Send.Respond(address, request, Hex.toHexString(responseBuilder.build().toByteArray()));
    }

    public static void main(String[] args) {
        byte[] data;
        Invocate invocation = new DrgsInvocate();
        data = invocation.serialize();
        Object object;
        object = invocation.transfer(data);
        Drgs.DrgsRequest request;
        request = (Drgs.DrgsRequest) object;
        System.out.println(request.getMainDiagnosisCode());
    }
}
