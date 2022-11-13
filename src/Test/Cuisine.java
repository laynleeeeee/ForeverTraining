package Test;

abstract class Cuisine {
    public abstract Cuisine serveFood(String dish);
}

class UnservableCuisineRequestException extends Exception {
    public UnservableCuisineRequestException(String message) {
        super(message);
    }
}

class Italian extends Cuisine{
    private String dish;

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }
    @Override
    public Cuisine serveFood(String dish) {
        setDish(dish);
        return this;
    }
}

class Mexican extends Cuisine{
    private String dish;

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }
    @Override
    public Cuisine serveFood(String dish) {
        setDish(dish);
        return this;
    }
}

class Japanese extends Cuisine{

    private String dish;

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }
    @Override
    public Cuisine serveFood(String dish) {
        setDish(dish);
        return this;
    }
}

class Chinese extends Cuisine {
    private String dish;

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }
    @Override
    public Cuisine serveFood(String dish) {
        setDish(dish);
        return this;
    }
}


class FoodFactory {
    static FoodFactory getFactory() {
        return new FoodFactory();
    }

    java.util.Map<String, Cuisine> cuisines =  new java.util.HashMap<String, Cuisine>();

    void registerCuisine(String cuisineKey, Cuisine cuisine){
        cuisines.put(cuisineKey, cuisine.serveFood(cuisineKey));
    }

    public Cuisine serveCuisine(String cuisine, String dish) throws UnservableCuisineRequestException {
        if(!cuisines.containsKey(cuisine)){
            throw new UnservableCuisineRequestException("Unservable cuisine " + cuisine + "for dish "+ dish);
        }
        else
            return cuisines.get(cuisine).serveFood(dish);
    }
}
