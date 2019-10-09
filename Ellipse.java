public class Ellipse {

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
     * @param width
     *            Horizontal Length
     * @param height
     *            Vertical Length
     * @param xPos
     *            x-coordinate
     * @param yPos
     *            y-coordinate
     * @param initialColour
     *            Initial color
     */
    public Ellipse(int xPos, int yPos, int width, int height, String initialColour) {
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        colour = initialColour;
    }

    /**
     * Reset horizontalLength to a new value.
     *
     * @param h
     *            New horizontal length.
     */
    void setHorizontalLength(int h) {
        width = h;
    }

    /**
     * Reset verticalLength to a new value.
     *
     * @param v
     *            New vertical length.
     */
    void setVerticalLength(int v) {
        height = v;
    }


    /**
     * Draws the ellipse on the canvas.
     */
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, colour, new java.awt.geom.Ellipse2D.Double(xPos, yPos, width, height));
        canvas.wait(0);
    }

}
