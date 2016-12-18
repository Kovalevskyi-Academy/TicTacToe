package ru.ematveev.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by apple on 16.12.16.
 */
public class FieldSmallTest {
    @Test
    public void testGetSize() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();
        final int expectedValue = 3;
        final int actualValue = fieldSmall.getSize();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetFigure() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();
        Point inputPoint = new Point(0,0);
        Figure inputFigure = Figure.O;
        fieldSmall.setFigure(inputPoint, inputFigure);
        Figure expectedValue = inputFigure;
        final Figure actualValue = fieldSmall.getFigure(inputPoint);

        assertEquals(expectedValue, actualValue);
    }

}