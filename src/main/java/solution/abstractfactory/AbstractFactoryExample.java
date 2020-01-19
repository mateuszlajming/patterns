package solution.abstractfactory;

interface Button {
    void paint();
}

class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("WinButton");
    }
}

class OSXButton implements Button {
    @Override
    public void paint() {
        System.out.println("OSXButton");
    }
}

interface GUIFactory {
    Button createButton();
}

class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}

class OSXFactory implements GUIFactory {
    public Button createButton() {
        return new OSXButton ();
    }
}

public class AbstractFactoryExample {

    private static GUIFactory factory(String appearance) {
        switch(appearance) {
            case "win":
                return new WinFactory();
            case "osx":
                return new OSXFactory();
            default:
                throw new IllegalArgumentException("unknown " + appearance);
        }
    }

    public static void main(final String[] arguments) {
        var winFactory = factory("win");
        var osxFactory = factory("osx");

        var button1 = winFactory.createButton();
        button1.paint();

        var button2 = osxFactory.createButton();
        button2.paint();
    }
}