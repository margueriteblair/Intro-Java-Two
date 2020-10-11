package com.margieproj;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        //it's an issue that because the type of the paramter is of the Object class
        //we can pass in literally any object
        //downcast this Object to the point class
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)){
            return false;
        } else {
            var other = (Point)obj;
            return other.x == x && other.y == y;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}