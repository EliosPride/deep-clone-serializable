package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String color;
    private String form;
    private int soundDb;
    private int volume;

    public Engine(String model, String color, String form, int soundDb, int volume) {
        this.model = model;
        this.color = color;
        this.form = form;
        this.soundDb = soundDb;
        this.volume = volume;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
