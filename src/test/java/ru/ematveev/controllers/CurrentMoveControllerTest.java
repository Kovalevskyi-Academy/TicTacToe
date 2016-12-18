package ru.ematveev.controllers;

import org.junit.Test;
import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;

import static org.junit.Assert.*;

public class CurrentMoveControllerTest {
    @Test
    public void testCurrentMove() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();
        Point p = new Point(0, 0);
        Point p1 = new Point(1, 0);
        Point p2 = new Point(2, 0);
        fieldSmall.setFigure(p, Figure.X);
        fieldSmall.setFigure(p1, Figure.O);
        fieldSmall.setFigure(p2, Figure.O);
        CurrentMoveController currentMoveController = new CurrentMoveController();
        final FieldSmall inputValue = new FieldSmall();
        final Figure actualValue = currentMoveController.currentMove(inputValue);
        final Figure expectedValue = Figure.X;

        assertEquals(expectedValue, actualValue);

    }
}