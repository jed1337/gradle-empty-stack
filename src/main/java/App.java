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
        System.out.println("Person make call length invalid");

        Person person = new Person();
        person.setName("Bob");
        person.setMobile(plainMobile);
        person.makeCall(twentyCharacters);
        person.setMobile(iPhone);
        person.makeCall(twentyCharacters);
        person.setMobile(android);
        person.makeCall(twentyCharacters);

        System.out.println();
        System.out.println("Person make call length sometimes valid");

        person.setMobile(plainMobile);
        person.makeCall(tenCharacters);
        person.setMobile(iPhone);
        person.makeCall(tenCharacters);
        person.setMobile(android);
        person.makeCall(tenCharacters);

        System.out.println();
        System.out.println("Robot make call");
        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        iPhoneRobot.makeCall(iPhone, tenCharacters);
    }
}
