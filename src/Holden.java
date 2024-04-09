public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {

        return getName() + "engine is starting";
    }

    @Override
    public String accelerete() {

        return getName() + "engine is accelerating";
    }

    @Override
    public String brake() {

        return getName() + "engine is braking";
    }
}
