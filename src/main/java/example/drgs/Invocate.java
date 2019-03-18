package example.drgs;

import org.irisnet.service.entity.SvcRequest;

import java.io.IOException;

public interface Invocate {

    byte[] serialize();

    Object transfer(byte[] data);

    void process(String address, SvcRequest request) throws IOException;
}
