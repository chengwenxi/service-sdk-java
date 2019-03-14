package example.drgs;

import com.google.protobuf.InvalidProtocolBufferException;

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
