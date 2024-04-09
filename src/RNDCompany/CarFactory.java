package RNDCompany;

public class CarFactory {
    public static void main(String[] args) {

        CarSkeleton electricCar = new ElectricCar("Tesla","electrical car",100,4);
        CarSkeleton hybridCar = new HybridCar("honda", "hybrid car", 50,6,8);
        CarSkeleton gasPoweredCar = new GasPoweredCar("opel","benzinli",500,8);
        printDriveResult(hybridCar);
        printDriveResult(gasPoweredCar);
        printDriveResult(electricCar);
    }
private static void printDriveResult(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.drive());
}
}
