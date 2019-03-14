package example.drgs;

public interface Invocate {

    byte[] serialize();

    Object transfer(byte[] data);
}
