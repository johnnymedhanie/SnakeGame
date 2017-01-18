package ca.ubc.cs.cpsc210.snake.model;

// Represents food.
public class Food {
    public static final int DECAY_AMOUNT = 10;
    public static final int INITIAL_NUTRITIONAL_VALUE = 100;
    public static int MIN_NUTRITIONAL_VALUE = 0;

    // the position of food
    private Cell position;
    // the nutritional value of food
    private int nutritionalValue;

    // EFFECTS: food has INITIAL_NUTRITIONAL_VALUE and is located at given cell
    public Food(Cell position) {
        // TODO: replace stub with cowmplete implementation
        this.position = position;
        nutritionalValue = INITIAL_NUTRITIONAL_VALUE;
    }

    // EFFECTS: food has given nutritional value and is located at given cell
    public Food(Cell position, int nutritionalValue) {
        // TODO: replace stub with complete implementation
        this.position = position;
        this.nutritionalValue = nutritionalValue;

    }

    public Cell getPosition() {
        // TODO: replace stub with complete implementation
        return this.position;
    }

    // MODIFIES: this
    // EFFECTS:  reduces nutritional value of food by DECAY_AMOUNT while maintaining a minimum
    //           nutritional value of zero
    public void decay() {
        // TODO: replace stub with complete implementation
        if (nutritionalValue >= DECAY_AMOUNT) {
            nutritionalValue -= DECAY_AMOUNT;
        }
        else {
            nutritionalValue = MIN_NUTRITIONAL_VALUE;
        }
    }

    public int getNutritionalValue() {
        // TODO: replace stub with complete implementation
        return nutritionalValue;
    }
}
