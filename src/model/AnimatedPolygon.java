package model;

import model.animation.Animation;
import model.clock.ClockObserver;
import model.polygon.Polygon;

import java.awt.*;

class AnimatedPolygon implements Paintable, ClockObserver {
    private model.polygon.Polygon polygon;
    private Animation animation;

    public AnimatedPolygon(Polygon polygon, Animation animation) {
        this.polygon = polygon;
        this.animation = animation;
    }

    @Override
    public void update() {
        polygon = animation.update(polygon);
    }

    @Override
    public void paint(Graphics g) {
        polygon.paint(g);
    }
}
