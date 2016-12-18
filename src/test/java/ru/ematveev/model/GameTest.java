package ru.ematveev.model;

import org.junit.Test;
import org.omg.CORBA.BAD_CONTEXT;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void testGetPlayer1() throws Exception {
        Player inputValue = new Player("Evgeny", Figure.O);
        Game.Builder builder = new Game.Builder();
        builder.player1(inputValue);
        Game game = new Game(builder);
        final Player actualValue = game.getPlayer1();
        final Player expectedValue = inputValue;

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetPlayer2() throws Exception {
        Player inputValue = new Player("Max", Figure.X);
        Game.Builder builder = new Game.Builder();
        builder.player2(inputValue);
        Game game = new Game(builder);
        final Player actualValue = game.getPlayer2();
        final Player expectedValue = inputValue;

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetField() throws Exception {

    }

    @Test
    public void testGetName() throws Exception {
        final String inputValue = "Evgeny";
        final Game.Builder builder = new Game.Builder();
        builder.name(inputValue);
        Game game = new Game(builder);
        final String actualValue = game.getName();
        final String expectedValue = inputValue;

        assertEquals(expectedValue, actualValue);

    }

}