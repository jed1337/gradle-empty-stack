package mobile_users;

import mobiles.Mobile;

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void makeCall(Mobile mobile, String message){
        mobile.call(message);
    }
}
