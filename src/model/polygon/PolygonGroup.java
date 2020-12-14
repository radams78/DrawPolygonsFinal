package model.polygon;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PolygonGroup extends model.polygon.Polygon {
    private final List<model.polygon.Polygon> polygons;

    public PolygonGroup(List<model.polygon.Polygon> polygons) {
        this.polygons = new ArrayList<>(polygons);
    }

    @Override
    public PolygonGroup translate(int dx, int dy) {
        return new PolygonGroup(polygons
                .stream()
                .map(p -> p.translate(dx, dy))
                .collect(Collectors.toList())
        );
    }

    @Override
    public void paint(Graphics g) {
        for (Polygon poly : polygons) {
            poly.paint(g);
        }
    }
}
