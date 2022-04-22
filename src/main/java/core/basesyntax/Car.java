package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private String weigh;
    private String owner;
    private int year;
    private Engine engine;

    public Car(String model, String color, String weigh, String owner, int year, Engine engine) {
        this.model = model;
        this.color = color;
        this.weigh = weigh;
        this.owner = owner;
        this.year = year;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
//        Car car = (Car) super.clone();
//        Engine engine = this.getEngine().clone();
//        car.setEngine(engine);
        return new Car(this.model, this.color, this.weigh, this.owner, this.year, this.engine.clone());
    }
}
