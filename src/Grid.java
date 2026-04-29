import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Rectangle;

public class Grid extends GraphicsGroup {
    public static final int GRID_WIDTH = 420;
    public static final int GRID_HEIGHT = 420;
    private Rectangle board;
    public List<Rectangle> cells = new ArrayList();
    private int x = 90;
    private int y = 190;



    public Grid() {
        board = new Rectangle(x,y,GRID_WIDTH,GRID_HEIGHT);
        add(board);
        for(int row = 0; row <3; row ++){


        for (int column = 0; column <3; column++) {
            double cellX = x + column * (GRID_WIDTH /3);
            double cellY = y + row * (GRID_HEIGHT/3);

            Rectangle cell = new Rectangle(cellX,cellY,GRID_WIDTH/3,GRID_HEIGHT/3);
            add(cell);
            cells.add(cell);
        }
    }

    }

    public List<Rectangle> getCells() {
        return cells;
    }
}
