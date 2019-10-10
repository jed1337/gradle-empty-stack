package mobiles;

public class IPhone extends Mobile {
    @Override
    protected String messenger() {
        return "<iPhone>Message";
    }

    @Override
    protected int messageLengthLimit() {
        return 10;
    }
}
