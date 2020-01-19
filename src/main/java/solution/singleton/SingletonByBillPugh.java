package solution.singleton;

public class SingletonByBillPugh {

    private SingletonByBillPugh() {}

    private static class SingletonHelper {
        private static final SingletonByBillPugh INSTANCE = new SingletonByBillPugh();
    }

    public static SingletonByBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void doSomething() {}
}
