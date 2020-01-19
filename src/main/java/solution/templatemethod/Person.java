package solution.templatemethod;

abstract public class Person {
    public String dayRoutine() {
        return wakeUp() + work() + goToSleep();
    }

    abstract String work();

    private String wakeUp() {
        return "Wake up, ";
    }

    private String goToSleep() {
        return ", Go to sleep";
    }
}

class Chief extends Person {
    @Override
    public String work() {
        return "Prepare food";
    }
}

class Policeman extends Person {
    @Override
    String work() {
        return "Prevent crime";
    }
}

