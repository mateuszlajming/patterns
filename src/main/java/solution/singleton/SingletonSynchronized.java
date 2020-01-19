package solution.singleton;

public class SingletonSynchronized {
    private volatile static SingletonSynchronized instance;

    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null)
            instance = new SingletonSynchronized();
        return instance;
    }

    public void doSomething() {}
}


