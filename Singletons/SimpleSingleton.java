package Singletons;

//The simplest singleton. Simple, quick, threads-safe.
public class SimpleSingleton {
    //100% threads-safe init :)
    //not lazy init :(
    private static final SimpleSingleton SIMPLE_SINGLETON = new SimpleSingleton();

    private SimpleSingleton(){}

    public static SimpleSingleton getInstance(){
        return SIMPLE_SINGLETON;
    }
}
