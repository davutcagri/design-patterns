package DrawingTypes;

import Entity.DrawingType;

public class StraightLine implements DrawingType {
    @Override
    public void draw() {
        System.out.println("Drawing straight line");
    }
}
