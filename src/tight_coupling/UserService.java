package tight_coupling;

public class UserService {

    NotificationService notificationService = new NotificationService();

    public void  notifyuser(String message){
        notificationService.send("Notification send ");

    }

}
