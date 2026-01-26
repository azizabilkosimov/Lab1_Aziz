// Motorcycle.java
/**
 * Project: Lab 1
 * Purpose Details: Motorcycle object made from parts
 * Course: IST 242
 */
public class Motorcycle {

    /**
     * The motorcycle model
     */
    private Model model;

    /**
     * The motorcycle color
     */
    private String color;

    /**
     * The motorcycle size
     */
    private double size;

    /**
     * The motorcycle frame
     */
    private Frame frame;

    /**
     * The motorcycle wheels (2 wheels)
     */
    private Wheel[] wheels;

    /**
     * The motorcycle engine
     */
    private Engine engine;

    /**
     * Builds a motorcycle and creates its parts
     *
     * @param model the motorcycle model
     * @param color the motorcycle color
     * @param size the motorcycle size
     * @param frameMaterial the frame material
     * @param wheelSize the wheel size
     * @param engineCc the engine cc
     * @param engineHp the engine hp
     */
    public Motorcycle(Model model, String color, double size,
                      Material frameMaterial, double wheelSize,
                      int engineCc, int engineHp) {

        this.model = model;
        this.color = color;
        this.size = size;

        this.frame = new Frame(frameMaterial);

        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);

        this.engine = new Engine(engineCc, engineHp);
    }

    /**
     * Gets the model object
     *
     * @return model
     */
    public Model getModel() {
        return model;
    }

    /**
     * Gets the motorcycle color
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Updates the motorcycle color
     *
     * @param color new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the motorcycle size
     *
     * @return size
     */
    public double getSize() {
        return size;
    }

    /**
     * Updates the motorcycle size
     *
     * @param size new size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Gets the frame material
     *
     * @return frame material
     */
    public Material getFrameMaterial() {
        return frame.getMaterial();
    }

    /**
     * Gets the wheel size
     *
     * @return wheel size
     */
    public double getWheelSize() {
        return wheels[0].getSize();
    }

    /**
     * Gets engine cc
     *
     * @return engine cc
     */
    public int getEngineCc() {
        return engine.getCc();
    }

    /**
     * Gets engine hp
     *
     * @return engine hp
     */
    public int getEngineHp() {
        return engine.getHp();
    }

    /**
     * Prints a start message
     */
    public void start() {
        System.out.println("Motorcycle is now running!");
    }

    /**
     * Prints a stop message
     */
    public void stop() {
        System.out.println("Motorcycle shut down.");
    }
}
