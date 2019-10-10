package mobiles;

public class Android extends Mobile {
    @Override
    protected String messenger() {
        return "Android";
    }

    @Override
    protected int messageLengthLimit() {
        return 15;
    }
}
