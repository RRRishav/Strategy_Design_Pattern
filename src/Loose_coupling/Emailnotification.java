package Loose_coupling;

public class Emailnotification implements NotificationSevice{
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
