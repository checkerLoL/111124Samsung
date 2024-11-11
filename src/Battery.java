public class Battery {
    private double batteryCapacity;
    private double batteryVoltage;
    private String batteryModel;

    public Battery() {
    }

    public Battery(double batteryCapacity, double batteryVoltage, String batteryModel) {
        this.batteryCapacity = batteryCapacity;
        this.batteryVoltage = batteryVoltage;
        this.batteryModel = batteryModel;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(double batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    public String getBatteryModel() {
        return batteryModel;
    }

    public void setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
    }
}
