package Singletons;

//Threads-safe lazy singleton. Slow singleton.
public class SynchronizedSingleton {
    private static SynchronizedSingleton SYNCHRONIZEDSINGLETON;

    private SynchronizedSingleton() {
    }

    //here is the weak point: only one thread can use this method - not the best choice
    public static synchronized SynchronizedSingleton getInstance(){
        if (SYNCHRONIZEDSINGLETON != null) {
            SYNCHRONIZEDSINGLETON = new SynchronizedSingleton();
        }
        return SYNCHRONIZEDSINGLETON;
    }

}
