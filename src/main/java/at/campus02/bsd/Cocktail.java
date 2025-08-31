package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink {

    private String name;
    private List<Liquid> ingredients;
    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
