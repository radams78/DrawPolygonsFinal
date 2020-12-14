package model.polygon;

import java.awt.*;

public class Line extends model.polygon.Polygon {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    @Override
    public Polygon translate(int dx, int dy) {
        Point newStart = new Point(start);
        Point newEnd = new Point(end);

        newStart.translate(dx, dy);
        newEnd.translate(dx, dy);
        return new Line(newStart, newEnd);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine((int) start.getX(), 
                (int) start.getY(), 
                (int) end.getX(), 
                (int) end.getY()
        );
    }
}
