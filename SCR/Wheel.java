// Wheel.java
/**
 * Project: Lab 1
 * Purpose Details: Wheel object
 * Course: IST 242
 */
public class Wheel {

    /**
     * Diameter/size of the wheel
     */
    private double size;

    /**
     * Creates a wheel with a size
     *
     * @param size wheel size
     */
    public Wheel(double size) {
        this.size = size;
    }

    /**
     * Gets the wheel size
     *
     * @return wheel size
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the wheel size
     *
     * @param size new wheel size
     */
    public void setSize(double size) {
        this.size = size;
    }
}

