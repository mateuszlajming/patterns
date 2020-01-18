package live.singleton;

public class SingletonLazy {
    private static volatile SingletonLazy singletonLazy;

    private SingletonLazy() {}

    public static synchronized SingletonLazy getInstance() {
        if(singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    // ---
    public void doSomething() {}
}
