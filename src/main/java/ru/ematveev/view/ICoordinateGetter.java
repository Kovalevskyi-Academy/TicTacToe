package ru.ematveev.view;

import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Point;


public interface ICoordinateGetter {
    public Point getMoveCoordinate(final FieldSmall field);
}
