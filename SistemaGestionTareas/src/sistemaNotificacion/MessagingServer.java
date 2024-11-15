package sistemaNotificacion;

public class MessagingServer {
    public NotificationManager notifications;

    public MessagingServer() {
        this.notifications = new NotificationManager();
    }

    public void receiveNewMessage(String message) {
        System.out.println("Este es un mensaje de notificacion: " + message);
        notifications.notifyDevices(message);
    }
}
