import java.awt.Polygon;

public class Triangle {

    /** Length of horizontal axis */
    private int width;

    /** Length of vertical axis */
    private int height;

    /**
     * The x- and y-coordinates describing the ellipse's position, denoting the
     * top left corner of its surrounding rectangle.
     */
    private int xPos;
    private int yPos;

    /**
     * The ellipse's colour. Available colours are enumerated in Type Colour.
     */
    private String colour;

    /**
     * Creates the ellipse, initializes all its attributes and draws it.
     *
     *
     * @param xPos
     *            x-coordinate
     * @param yPos
     *            y-coordinate
     * @param width
     *            width
     * @param height
     *            height
     * @param initialColour
     *            Initial color
     */
    public Triangle(int xPos, int yPos, int width, int height, String initialColour) {
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        this.colour = initialColour;
    }

    /**
     * Draws the triangle onto the canvas.
     */
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        // canvas.draw(this, colour, new Arc2D.Double(xPos, yPos,
        // verticalLength, horizontalLength, 0, 180, Arc2D.PIE));
        canvas.draw(this, colour, new Polygon(new int[] {xPos + width / 2,  xPos, xPos + width },
                new int[] {yPos, yPos + height,  yPos + height }, 3));
        canvas.wait(0);
    }

}
