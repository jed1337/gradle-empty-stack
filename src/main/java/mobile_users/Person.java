package mobile_users;

import mobiles.Mobile;

public class Person {
    private String name;
    private Mobile mobile;

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void makeCall(String message){
        mobile.call(message);
    }
}
