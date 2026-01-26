// Model.java
/**
 * Project: Lab 1
 * Purpose Details: Motorcycle model info
 * Course: IST 242
 */
public class Model {

    /**
     * Model name (example: Ninja 650)
     */
    private String name;

    /**
     * Creates a model using a name
     *
     * @param name model name
     */
    public Model(String name) {
        this.name = name;
    }

    /**
     * Gets the model name
     *
     * @return model name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the model name
     *
     * @param name new model name
     */
    public void setName(String name) {
        this.name = name;
    }
}
