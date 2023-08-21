package DrawingTypes;

import Entity.DrawingType;

public class Freehand implements DrawingType {
    @Override
    public void draw() {
        System.out.println("drawing freehand style");
    }
}
