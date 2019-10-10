package mobile_users;

import mobiles.IPhone;

public class IPhoneRobot {
    public void makeCall(IPhone iPhone, String message){
        iPhone.call(message);
    }
}
