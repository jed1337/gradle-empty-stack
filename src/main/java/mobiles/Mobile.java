package mobiles;

public class Mobile {
    private String name;
    private String color;
    private String brand;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void call(String message) {
        if(doesExceedMessageLength(message)){
            System.out.println(String.format("%s cannot be sent", messenger()));
        } else{
            System.out.println(String.format("%s : %s", messenger(), message));
        }
    }

    private boolean doesExceedMessageLength(String message) {
        return message.length() > messageLengthLimit();
    }

    protected String messenger(){
        return "Message";
    }

    protected int messageLengthLimit(){
        return 5;
    }

    public void printInformation(){
        System.out.println(String.format("name: %s, color %s, brand %s", name, color, brand));
    }
}
