import model.clock.Clock;
import model.Paintable;
import model.PolygonFactory;
import view.PolygonView;


public class Main {
    public static void main(String[] args) {
        // Set up model
        Clock clock = new Clock();

        Paintable square = PolygonFactory.createShufflingSquare(50, 50, clock);
//        Paintable triangle = PolygonFactory.createShufflingTriangle(100, 100, clock);
//        Paintable rectangle = PolygonFactory.createShufflingRectangle(50, 150, clock);

        // Set up view
        PolygonView view = new PolygonView();
        view.add(square);
//        view.add(triangle);
//        view.add(rectangle);
        clock.addObserver(view);
        
        new Thread(clock).start();
    }
}
