package DrawingTools;

import Entity.DrawingTool;

public class Brush implements DrawingTool {
    @Override
    public void draw() {
        System.out.println("Drawing with a brush");
    }
}
