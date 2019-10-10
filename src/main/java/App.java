import mobile_users.IPhoneRobot;
import mobile_users.Person;
import mobiles.Android;
import mobiles.IPhone;
import mobiles.Mobile;

public class App {
    public static void main(String[] args) {
        final String twentyCharacters = "20        characters";
        final String tenCharacters = "10   chars";

        Mobile plainMobile = new Mobile();
        IPhone iPhone = new IPhone();
        Android android = new Android();

//        plainMobile.call(twentyCharacters);
//        iPhone.call(twentyCharacters);
//        android.call(twentyCharacters);

        plainMobile.setBrand("Nokia");
        plainMobile.setColor("red");
        plainMobile.setName("Plain");
        plainMobile.printInformation();

        System.out.println();

        Person person = new Person();
        person.setName("Bob");
        person.makeCall(plainMobile, twentyCharacters);
        person.makeCall(iPhone, twentyCharacters);
        person.makeCall(android, twentyCharacters);

        System.out.println();

        person.makeCall(plainMobile, tenCharacters);
        person.makeCall(iPhone, tenCharacters);
        person.makeCall(android, tenCharacters);

        System.out.println();
        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        iPhoneRobot.makeCall(iPhone, tenCharacters);
    }
}
