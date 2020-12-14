package model.animation;

import model.animation.Animation;
import model.polygon.Polygon;

public class DiagonalShuffle implements Animation {
    private int ticker = 0;
    private boolean direction = true;

    @Override
    public Polygon update(Polygon polygon) {
        ticker++;
        int value = direction ? 10 : -10;
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
        return polygon.translate(value, value);
    }
}
