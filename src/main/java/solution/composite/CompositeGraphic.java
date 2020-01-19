package solution.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    private final List<Graphic> childGraphics = new ArrayList<>();

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    @Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }
}
