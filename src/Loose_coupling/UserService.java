package Loose_coupling;

public class UserService  {
     NotificationSevice notificationSevice;

    public UserService(NotificationSevice notificationSevice) {
        this.notificationSevice = notificationSevice;
    }



    public void notifyuser(String message) {
        notificationSevice.send("Notification are now from email");
    }
}
