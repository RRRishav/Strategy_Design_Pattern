package Loose_coupling;

public class UserService  {
     NotificationSevice notificationSevice;

    public UserService(NotificationSevice notificationSevice) {
        this.notificationSevice = notificationSevice;
    }

    public  void notifyUser(String message){
         notificationSevice.send("Notification are nowfrom email");
    }


}
