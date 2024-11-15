package sistemaNotificacion;

public class Device implements DeviceListener{
    private String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(String message) {
        System.out.println(deviceName + " recibió el mensaje: " + message);
    }
}
