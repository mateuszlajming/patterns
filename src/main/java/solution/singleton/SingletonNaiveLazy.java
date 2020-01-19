package solution.singleton;

public class SingletonNaiveLazy {
    private static SingletonNaiveLazy instance;

    private SingletonNaiveLazy() {}

    public static SingletonNaiveLazy getInstance() {
        if (instance == null)
            instance = new SingletonNaiveLazy();
        return instance;
    }

    public void doSomething() {}
}


