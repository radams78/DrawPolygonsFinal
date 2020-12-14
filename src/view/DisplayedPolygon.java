package view;

import model.Paintable;

import javax.swing.*;
import java.awt.*;

class DisplayedPolygon extends JComponent {
    private Paintable polygon;

    public DisplayedPolygon(Paintable polygon) {
        this.polygon = polygon;
    }

    @Override
    public void paint(Graphics g) {
        polygon.paint(g);
    }
}
