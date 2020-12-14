package view;

import model.clock.ClockObserver;
import model.Paintable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PolygonView extends JFrame implements ClockObserver {
    private List<Paintable> components = new ArrayList<>();
    
    public PolygonView() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(30, 30, 300, 300);
        setVisible(true);
    }
    
    @Override
    public void update() {
        repaint();
    }

    public void add(Paintable polygon) {
        components.add(polygon);
        add(new DisplayedPolygon(polygon));
    }
}
