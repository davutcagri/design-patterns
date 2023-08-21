import DrawingTools.Brush;
import DrawingTools.Pen;
import DrawingTypes.Freehand;
import DrawingTypes.StraightLine;
import Entity.Drawing;
import Entity.DrawingTool;
import Entity.DrawingType;

public class Main {
    public static void main(String[] args) {
        DrawingTool pen = new Pen();
        DrawingType freehand = new Freehand();
        Drawing drawing1 = new Drawing(pen, freehand);
        drawing1.draw();

        DrawingTool brush = new Brush();
        DrawingType straightLine = new StraightLine();
        Drawing drawing2 = new Drawing(brush, straightLine);
        drawing2.draw();
    }
}