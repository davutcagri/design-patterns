package Entity;

public class Drawing {
    private DrawingTool drawingTool;
    private DrawingType drawingType;

    public Drawing(DrawingTool drawingTool, DrawingType drawingType) {
        this.drawingTool = drawingTool;
        this.drawingType = drawingType;
    }

    public void draw() {
        System.out.print("Tool: ");
        drawingTool.draw();
        System.out.print("Type: ");
        drawingType.draw();
        System.out.println("------------------");
    }
}
