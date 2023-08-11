package Singletons;

//fast lazy and thread-safe, almost ideal
public class DoubleCheckedLockingSingleton {
    //volatile to make operations atomic
    private static volatile DoubleCheckedLockingSingleton SINGLETON;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance(){
        if (SINGLETON == null) {
            //synchronized only block for creating - not the method - fast work
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (SINGLETON == null) {
                    SINGLETON = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return SINGLETON;
    }

    //here is an example from Habr:
//    public static Singleton getInstance() {
//        Singleton localInstance = instance; <<< WHY DO WE NEED THIS LOCAL OBJECT? I REMOVED IT BECAUSE I SEE NO SENSE
//        if (localInstance == null) {
//            synchronized (Singleton.class) {
//                localInstance = instance;
//                if (localInstance == null) {
//                    instance = localInstance = new Singleton();
//                }
//            }
//        }
//        return localInstance;
//    }
}
