package model.animation;

import model.polygon.Polygon;

public interface Animation {
    Polygon update(Polygon polygon);
}
