package ru.ematveev.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by apple on 16.12.16.
 */
public class PointTest {
    @Test
    public void testGetX() throws Exception {
        int inputValue = 1;
        int inputY = 2;
        int expectedValue = inputValue;
        Point point = new Point(inputValue, inputY);
        int actualValue = point.getX();
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testGetY() throws Exception {
        int inputValue = 1;
        int inputX = 2;
        int expectedValue = inputValue;
        Point point = new Point(inputX, inputValue);
        int actualValue = point.getY();
        assertEquals(expectedValue, actualValue);
    }

}