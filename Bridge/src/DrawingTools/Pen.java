package DrawingTools;

import Entity.DrawingTool;

public class Pen implements DrawingTool {
    @Override
    public void draw() {
        System.out.println("Drawing with a pen");
    }
}
