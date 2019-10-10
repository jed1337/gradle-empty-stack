package mobiles;

public class Mobile {
    private String name;
    private String color;
    private String brand;

    public void call(String message) {
        System.out.println(messenger()+" : " + message);
    }

    protected String messenger(){
        return "Message";
    }
}
