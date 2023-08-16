package Singletons;

//Simple, lazy, quick but NOT thread-safe singleton.
public class LazySingleton {
    private static LazySingleton LAZYSINGLETON;

    private LazySingleton() {
    }

    //lazy init is here, but without synchronized it is dangerous - two or more threads can create two or more singletons
    public static LazySingleton getInstance() {
        if (LAZYSINGLETON != null) {
            LAZYSINGLETON = new LazySingleton();
        }
        return LAZYSINGLETON;
    }
}
