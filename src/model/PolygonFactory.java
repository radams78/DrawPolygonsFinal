package model;

import model.animation.DiagonalShuffle;
import model.clock.Clock;
import model.polygon.Line;
import model.polygon.Polygon;
import model.polygon.PolygonGroup;

import java.awt.*;
import java.util.Arrays;

public class PolygonFactory {
    public static AnimatedPolygon createShufflingSquare(int x, int y, Clock clock) {
        AnimatedPolygon polygon = new AnimatedPolygon(
                createSquare(x, y),
                new DiagonalShuffle()
        );
        clock.addObserver(polygon);
        return polygon;
    }

    static model.polygon.Polygon createSquare(int x, int y) {
        Line bottom = new Line(new Point(x-10, y+10), new Point(x+10, y+10));
        Line top = new Line(new Point(x-10, y-10), new Point(x+10, y-10));
        Line left = new Line(new Point(x-10, y-10), new Point(x-10, y+10));
        Line right = new Line(new Point(x+10, y-10), new Point(x+10, y+10));
        return new PolygonGroup(Arrays.asList(new Polygon[]{
                bottom, top, left, right
        }.clone()));
    }
}
