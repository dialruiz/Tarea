package sistemaNotificacion;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private List<DeviceListener> listeners = new ArrayList<>();

    public void subscribe(DeviceListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(DeviceListener listener) {
        listeners.remove(listener);
    }

    public void notifyDevices(String message) {
        for (DeviceListener listener : listeners) {
            listener.update(message);
        }
    }
}
