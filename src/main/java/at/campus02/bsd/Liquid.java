package at.campus02.bsd;
/**
 * Represents a liquid component of a drink
 * Each liquid has a name, a volume in liters, and an alcohol percentage
 */
public class Liquid {

    /**
     * Name of the liquid
     */
    private String name;

    /**
     * Volume of the liquid in liters
     */
    private double volume;

    /**
     * Alcohol percentage by volume (e.g. 50)
     */
    private double alcoholPercent;

    /**
     * Creates a Liquid object with given name, volume and alcohol percentage
     *
     * @param name name of the liquid
     * @param volume volume of the liquid in liters
     * @param alcoholPercent alcohol percentage by volume (e.g. 50)
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Returns the name of the liquid
     *
     * @return the name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid
     *
     * @param name new name of the liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the volume of the liquid in liters
     *
     * @return the volume in liters
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid
     *
     * @param volume new volume in liters
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Returns the alcohol percentage by volume
     *
     * @return alcohol percentage (e.g. 50)
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol percentage by volume
     *
     * @param alcoholPercent new alcohol percentage (e.g. 42)
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}

