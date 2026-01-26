// Main.java
/**
 * Project: Lab 1
 * Purpose Details: Runs tests for the Motorcycle class
 * Course: IST 242
 */
public class Main {

    /**
     * Starts the program
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Motorcycle mA =
                new Motorcycle(new Model("Ninja 650"), "Green", 30.0,
                        Material.CHROMOLY_STEEL, 17.0, 649, 67);

        Motorcycle mB =
                new Motorcycle(new Model("Iron 883"), "Matte Black", 33.0,
                        Material.CARBON_STEEL, 16.0, 883, 50);

        Motorcycle mC =
                new Motorcycle(new Model("Bonneville T100"), "Silver", 31.5,
                        Material.STAINLESS_STEEL, 17.0, 900, 65);

        Motorcycle mD =
                new Motorcycle(new Model("MT-07"), "Gray", 29.8,
                        Material.HIGH_CARBON_STEEL, 17.0, 689, 74);

        System.out.println("Model: " + mA.getModel().getName());
        System.out.println("Color: " + mA.getColor());
        System.out.println("Frame Material: " + mA.getFrameMaterial());
        System.out.println("Wheel Size: " + mA.getWheelSize());
        System.out.println("Engine CC: " + mA.getEngineCc());
        System.out.println("Engine HP: " + mA.getEngineHp());
        System.out.println();

        System.out.println("Model: " + mB.getModel().getName());
        System.out.println("Color: " + mB.getColor());
        System.out.println("Frame Material: " + mB.getFrameMaterial());
        System.out.println("Wheel Size: " + mB.getWheelSize());
        System.out.println("Engine CC: " + mB.getEngineCc());
        System.out.println("Engine HP: " + mB.getEngineHp());
        System.out.println();

        System.out.println("Model: " + mC.getModel().getName());
        System.out.println("Color: " + mC.getColor());
        System.out.println("Frame Material: " + mC.getFrameMaterial());
        System.out.println("Wheel Size: " + mC.getWheelSize());
        System.out.println("Engine CC: " + mC.getEngineCc());
        System.out.println("Engine HP: " + mC.getEngineHp());
        System.out.println();

        System.out.println("Model: " + mD.getModel().getName());
        System.out.println("Color: " + mD.getColor());
        System.out.println("Frame Material: " + mD.getFrameMaterial());
        System.out.println("Wheel Size: " + mD.getWheelSize());
        System.out.println("Engine CC: " + mD.getEngineCc());
        System.out.println("Engine HP: " + mD.getEngineHp());

        mA.start();
        mA.stop();
    }
}
