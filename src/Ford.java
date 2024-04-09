public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {

        return getName() + " engine is starting";
    }

    @Override
    public String accelerete() {

        return getName() + " engine is accelerating";
    }

    @Override
    public String brake() {

        return getName() + " engine is braking";
    }
}
