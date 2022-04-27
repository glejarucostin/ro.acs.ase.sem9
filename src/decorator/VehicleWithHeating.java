package decorator;

public class VehicleWithHeating extends VehicleDecorator {
    private boolean isHeatingOn;

    public VehicleWithHeating(Vehicle vehicle) {
        super(vehicle);
    }

    public boolean getAlarmStatus() {
        return isHeatingOn;
    }

    public void activateHeating() {
        isHeatingOn = true;
        System.out.println("Incalzirea a pornit!");
    }

    public void deactivateHeating() {
        isHeatingOn = false;
        System.out.println("Incalzirea s-a oprit!");
    }

    @Override
    public void stop() {
        super.stop();
        activateHeating();
    }
}