package sistemaNotificacion;

public class MessagingApp {
    public static void main (String[] args ){

        MessagingServer server = new MessagingServer();

        Device celular = new Device("Celular");
        Device computador = new Device("Computador");
        Device appleWatch = new Device("apple watch");

        server.notifications.subscribe(celular);
        server.notifications.subscribe(computador);
        server.notifications.subscribe(appleWatch);

        server.receiveNewMessage("Este es un servicio de notifiacion para todos los dispositivos de jose");

        server.notifications.unsubscribe(computador);
        server.notifications.unsubscribe(appleWatch);

        server.receiveNewMessage("Este es un servicio de notificacion para el celular de jose");

    }
}
