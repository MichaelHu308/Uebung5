package at.campus02.bsd;

import java.util.List;

/**
 * Represents a cocktail drink composed of multiple liquid ingredients
 * Extends the Drink class
 */
public class Cocktail extends Drink {

    private String name;
    private List<Liquid> ingredients;

    /**
     * Creates a Cocktail object with the given name and list of ingredients
     *
     * @param name        the name of the cocktail
     * @param ingredients the list of liquid ingredients in the cocktail
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.name = name;
        this.ingredients = ingredients;
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        return 0;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return false;
    }
}

