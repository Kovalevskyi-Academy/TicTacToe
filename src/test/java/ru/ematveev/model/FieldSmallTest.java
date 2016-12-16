package ru.ematveev.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by apple on 16.12.16.
 */
public class FieldSmallTest {
    @Test
    public void testGetSize() throws Exception {
        final int expectedValue = 3;
        FieldSmall fieldSmall = new FieldSmall();
        final int actualValue = fieldSmall.getSize();
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testSetFigure() throws Exception {
        FieldSmall fieldSmall = new FieldSmall();
        Point inputPoint = new Point(0,0);
        Figure inputFigure = Figure.O;
        Figure expectedValue = inputFigure;

        fieldSmall.setFigure(inputPoint, inputFigure);
        final Figure actualValue = fieldSmall.getFigure(inputPoint);
        assertEquals(expectedValue, actualValue);
    }

}