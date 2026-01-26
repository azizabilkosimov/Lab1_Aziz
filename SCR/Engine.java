// Engine.java
/**
 * Project: Lab 1
 * Purpose Details: Engine object
 * Course: IST 242
 */
public class Engine {

    /**
     * Engine displacement in CC
     */
    private int cc;

    /**
     * Engine horsepower
     */
    private int hp;

    /**
     * Builds an engine using cc and hp
     *
     * @param cc engine CC
     * @param hp engine horsepower
     */
    public Engine(int cc, int hp) {
        this.cc = cc;
        this.hp = hp;
    }

    /**
     * Gets engine CC
     *
     * @return cc value
     */
    public int getCc() {
        return cc;
    }

    /**
     * Sets engine CC
     *
     * @param cc new cc value
     */
    public void setCc(int cc) {
        this.cc = cc;
    }

    /**
     * Gets engine horsepower
     *
     * @return hp value
     */
    public int getHp() {
        return hp;
    }

    /**
     * Sets engine horsepower
     *
     * @param hp new hp value
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
}

