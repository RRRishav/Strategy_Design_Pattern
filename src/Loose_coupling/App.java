package Loose_coupling;

public class App {
    public static void main(String[] args) {
        NotificationSevice emailService = new Emailnotification();
        UserService userService = new UserService(emailService);
        userService.notifyuser("hello");
    }
}