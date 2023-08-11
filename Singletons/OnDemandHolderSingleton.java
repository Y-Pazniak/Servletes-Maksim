package Singletons;

//this is the best solution
//class creation in java is thread-safety, that means when class creates with an object, it is 100% thread-safe
public class OnDemandHolderSingleton {
    public static class SingletonHolder {
        public static final SingletonHolder HOLDER_INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
