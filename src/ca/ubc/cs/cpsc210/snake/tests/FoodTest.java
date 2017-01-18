package ca.ubc.cs.cpsc210.snake.tests;

import ca.ubc.cs.cpsc210.snake.model.Cell;
import ca.ubc.cs.cpsc210.snake.model.Food;
import ca.ubc.cs.cpsc210.snake.model.SnakeGame;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
// jUnit tests for Food class
public class FoodTest {
    private Food testFood;

    @Before
    public void runBefore() {
        testFood = new Food(new Cell(SnakeGame.BOARD_ROWS / 2, SnakeGame.BOARD_COLS / 2));
    }

    @Test
    public void testTemplate() {
        // use this as a template for designing your tests
    }

    @Test
    public void testConstructor() {
        assertEquals(testFood.getPosition(), new Cell(SnakeGame.BOARD_ROWS / 2, SnakeGame.BOARD_COLS / 2));
        assertEquals(testFood.getNutritionalValue(),(Food.INITIAL_NUTRITIONAL_VALUE));
    }
    @Test
    public void testConstructor2() {
     Food Food2 = new Food (new Cell(SnakeGame.BOARD_ROWS / 2, SnakeGame.BOARD_COLS / 2), 60);
        assertEquals(Food2.getPosition(), new Cell(SnakeGame.BOARD_ROWS / 2, SnakeGame.BOARD_COLS / 2));
    }

    @Test
    public void testDecay() {
        testFood.decay();
        assertEquals(testFood.getNutritionalValue(), Food.INITIAL_NUTRITIONAL_VALUE - Food.DECAY_AMOUNT);
    }

    @Test
    public void testDecayZero() {
        testFood.decay();
        testFood.decay();
        testFood.decay();
        testFood.decay();
        testFood.decay();
        testFood.decay();
        testFood.decay();
        testFood.decay();
        testFood.decay();
        testFood.decay();
        assertEquals(testFood.getNutritionalValue(), Food.MIN_NUTRITIONAL_VALUE);
        testFood.decay();
        assertEquals(testFood.getNutritionalValue(), Food.MIN_NUTRITIONAL_VALUE);
    }

    @Test
    public void testGetNutritionalValue() {
        assertEquals(testFood.getNutritionalValue(), Food.INITIAL_NUTRITIONAL_VALUE);
    }

}