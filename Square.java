import java.awt.geom.Rectangle2D;

public class Square {

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
     *            x-coordinate
     * @param height
     *            y-coordinate
     * @param dimension
     *            width
     * @param initialColour
     *            Initial color
     */
    public Square(int width, int height, int dimension, String initialColour) {
        this.width = dimension;
        this.height = dimension;
        xPos = width;
        yPos = height;
        colour = initialColour;
    }


    /**
     * Draws the square onto canvas.
     */
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "black", new Rectangle2D.Double(xPos, yPos, width, height));
        canvas.draw(this, colour, new Rectangle2D.Double(xPos + 1, yPos + 1, width - 2, height - 2));
        canvas.wait(0);
    }

}
