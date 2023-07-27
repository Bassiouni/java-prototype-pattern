package after.proto;

public interface Prototype<T extends Prototype<T>> {
    T clone();
}
