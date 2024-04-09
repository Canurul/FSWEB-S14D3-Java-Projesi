package RNDCompany;

public class HybridCar extends CarSkeleton{
    private double avgPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgPerLitre = avgPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgPerLitre() {
        return avgPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public String startEngine() {
        return getName() + "car is starting";
    }

    @Override
    public String drive() {
        runEngine(this);
        return "run from hybrid car";
    }

}
