package model.clock;

import java.util.ArrayList;
import java.util.List;

public class Clock implements Runnable {
    private List<ClockObserver> observers = new ArrayList<>();
    
    public void addObserver(ClockObserver observer) {
        observers.add(observer);
    }
    
    private void updateObservers() {
        for (ClockObserver observer : observers) {
            observer.update();
        }
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(500);
                updateObservers();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
