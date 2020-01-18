package live.abstractfactory;

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

    @Override
    public Button createButton() {
        return new WinButton();
    }
}

class OSXFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new OSXButton();
    }
}

public class AbstractFactoryExample {
    private  static GUIFactory factory(String appearance) {
        switch (appearance) {
            case "win": return new WinFactory();
            case "osx": return new OSXFactory();
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        var factoryWin = factory("win");
        var factoryOsx = factory("osx");

        var buttonWin = factoryWin.createButton();
        var buttonOsx = factoryOsx.createButton();

        buttonWin.paint();
        buttonOsx.paint();
    }
}
