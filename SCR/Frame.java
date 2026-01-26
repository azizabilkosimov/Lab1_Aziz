// Frame.java
/**
 * Project: Lab 1
 * Purpose Details: Frame object for a motorcycle
 * Course: IST 242
 */
public class Frame {

    /**
     * What the frame is made out of
     */
    private Material material;

    /**
     * Builds a frame using the given material
     *
     * @param material the frame material
     */
    public Frame(Material material) {
        this.material = material;
    }

    /**
     * Gets the frame material
     *
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Updates the frame material
     *
     * @param material the new material
     */
    public void setMaterial(Material material) {
        this.material = material;
    }
}
